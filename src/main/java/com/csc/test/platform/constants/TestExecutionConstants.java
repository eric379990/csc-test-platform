package com.csc.test.platform.constants;

public interface TestExecutionConstants {

    public static enum TestResult {
        NO_RUN,
        PASSED,
        FAILED
    }

    public static enum HttpRequestType {
        POST("POST", 0), GET("GET", 1), PUT("PUT", 2), DELETE("DELETE", 3), HEAD("HEAD", 4), OPTIONS("OPTIONS", 5), PATCH("PATCH", 6);

        private String name;
        private int key;

        private HttpRequestType(String name, int key) {
            this.name = name;
            this.key = key;
        }

        public static String getName(int key) {
            for (HttpRequestType t : HttpRequestType.values()) {
                if (t.key == key) {
                    return t.name;
                }
            }
            return null;
        }
    }

    public static enum HttpProtocolType {
        HTTP("HTTP", 0), HTTPS("HTTPS", 1);

        private String name;
        private int key;

        private HttpProtocolType(String name, int key) {
            this.name = name;
            this.key = key;
        }

        public static String getName(int key) {
            for (HttpProtocolType t : HttpProtocolType.values()) {
                if (t.key == key) {
                    return t.name;
                }
            }
            return null;
        }
    }
}
