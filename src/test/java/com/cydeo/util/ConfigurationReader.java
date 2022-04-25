package com.cydeo.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1 - Create the object of Properties
    private static Properties properties = new Properties();

    static{
        try {
        //2 - We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3 - Load the properties object use FileInputStream object
            properties.load(file);

            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
