package com.kings.socket.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
    private static Properties prop = new Properties();
    
    static{
        try {
            InputStream in = Object.class.getResourceAsStream("/config.properties");
            prop.load(in);
        } catch (IOException e) {
        }
    }
    
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}