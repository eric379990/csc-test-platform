package com.csc.test.platform.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import com.csc.test.platform.service.impl.TestExecutionServiceImpl;

public class DbUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(DbUtils.class);

    public static boolean executeSql(String url, String user, String pwd, String sql) {
        try {
            LOGGER.info("Start to execute sql script on url "+url);
            LOGGER.info("Sql script: "+sql);
            Connection connection = DriverManager.getConnection(url, user, pwd);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            LOGGER.error("Sql script execution error: "+ e.getMessage());
            return false;
        }
    }
}
