package com.trycloud.utilities;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties;

    static {

        try {
            //what file to read
            String path = "configuration.properties";
            //read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            //properties --> class that store properties in key / value format
            properties = new Properties();
            //the values from the file input is loaded / fed into the properties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    //In this class we will implement the repeated steps of reading
    // from configuration.properties file



    //#4- Use the object to read from the configuration.properties file
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }


}
