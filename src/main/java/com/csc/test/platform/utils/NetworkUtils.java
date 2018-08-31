package com.csc.test.platform.utils;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.csc.test.platform.constants.TestExecutionConstants;
import com.csc.test.platform.model.Api;
import com.csc.test.platform.model.ApiEnv;
import com.csc.test.platform.model.ApiHeader;

public class NetworkUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(NetworkUtils.class);
    public static String DEFAULT_LOCAL_HOST_ADDRESS = getLocalHostAddress();
    public static String DEFAULT_LOCAL_HOST_NAME = getLocalHostName();

    static String getLocalHostAddress() {
        InetAddress localHost = null;
        try {
            localHost = InetAddress.getLocalHost();
        } catch (Exception e) {
            LOGGER.error("Error while get localhost address", e);
        }
        if (localHost != null && !localHost.isLoopbackAddress()) {
            return localHost.getHostAddress();
        }
        return null;
    }

    public static String getLocalHostName() {
        String hostName = null;
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            LOGGER.error("Error while get localhost name", e);
        }
        if (hostName != null && !"localhost".equals(hostName)) {
            return hostName;
        }
        return hostName;
    }

    public static String formatUrl(ApiEnv env, Api api) {
        if(env!=null && api!=null && !env.getUrl().isEmpty() && !api.getApiuri().isEmpty()) {
            String frontUrl = env.getUrl();
            StringBuilder sb = new StringBuilder();
            sb.append(TestExecutionConstants.HttpProtocolType.getName(api.getApiprotocol()));
            if(frontUrl.toLowerCase().startsWith("https")) {
                sb.append(frontUrl.substring(5, frontUrl.length()));
            }
            else if(frontUrl.toLowerCase().startsWith("http")) {
                sb.append(frontUrl.substring(4, frontUrl.length()));
            }
            else {
                sb.append("://" + frontUrl);
            }

            if(env.getPort()!=null && env.getPort().length()>0) {
                sb.append(":");
                sb.append(env.getPort());
            }

            if(api.getApiuri().startsWith("/")) {
                sb.append(api.getApiuri());
            }else {
                sb.append("/" + api.getApiuri());
            }
            return sb.toString();
        }
        return null;
    }

    //请求远程服务
    public static Map<String, Object> sendHttpRequest(String method, String completeURL,
            List<ApiHeader> headerList, List<Map<String, String>> paramList){
        LOGGER.info("Test URL: "+ completeURL);
        Map<String, Object> result = new HashMap<String, Object>();
        HttpEntity<JSONObject> requestEntity = null;
        int schemaIdForTest = 0;
        try{
             SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
             RestTemplate restTemplate = new RestTemplate(requestFactory);
             HttpHeaders requestHeaders = new HttpHeaders();
             JSONObject params = new JSONObject();
             if (paramList != null && !paramList.isEmpty()) {
                 for (Map<String, String> param : paramList) {
                     if(!param.get("key").equalsIgnoreCase("schemaIdForTest")) {
                         params.put(param.get("key"), param.get("value"));
                     }else {
                         schemaIdForTest = Integer.parseInt(param.get("value"));
                     }
                 }
             }
             requestHeaders.setContentType(MediaType.APPLICATION_JSON);
             if(headerList != null && !headerList.isEmpty()) {
                 for(ApiHeader header : headerList) {
                     requestHeaders.add(header.getHeadername(), header.getHeadervalue());
                 }
             }

             LOGGER.info("Test Data: "+ params);
             requestHeaders.setContentType(MediaType.APPLICATION_JSON);
             HttpMethod requestType = HttpMethod.GET;
             switch (method){
                case "GET":
                    requestType = HttpMethod.GET;
                    break;
                case "POST":
                    requestType = HttpMethod.POST;
                    break;
                case "PUT":
                    requestType = HttpMethod.PUT;
                    break;
                case "DELETE":
                    requestType = HttpMethod.DELETE;
                    break;
                case "HEAD":
                    requestType = HttpMethod.HEAD;
                    break;
                case "OPTIONS":
                    requestType = HttpMethod.OPTIONS;
                    break;
                default:
                    break;
             }
             requestEntity = new HttpEntity<>(params, requestHeaders);
             Map<String, Object> testResult = new HashMap<String, Object>();
             ResponseEntity<String> responseEntity = restTemplate.exchange(completeURL, requestType, requestEntity, String.class);
             HttpStatus statusCode = responseEntity.getStatusCode();
             HttpHeaders headers = responseEntity.getHeaders();
             List<Map<String, String>> responseHeaders = new ArrayList<Map<String, String>>();
             for(String key : headers.keySet()){
                 Map<String, String> responseHeader = new HashMap<String, String>();
                 responseHeader.put("key", key);
                 responseHeader.put("value", StringUtils.join(headers.get(key).toArray()));
                 responseHeaders.add(responseHeader);
             }
             String body = responseEntity.getBody();
             testResult.put("headers", responseHeaders);
             testResult.put("body", body);
             result.put("testHttpCode", new Integer(statusCode.toString()));
             result.put("testResult", testResult);
             result.put("schemaId", schemaIdForTest);
        }
        catch (Exception e){
             Map<String, Object> testResult = new HashMap<String, Object>();
             testResult.put("headers", null);
             testResult.put("body", e.getMessage());
             result.put("testHttpCode", 500);
             result.put("testResult", testResult);
        }
        result.put("request", requestEntity.toString());
        return result;
    }

}
