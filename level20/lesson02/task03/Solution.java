package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.*;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties props = new Properties();

    public void fillInPropertiesMap() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            InputStream propsStream = new FileInputStream(fileName);
            load(propsStream);
            reader.close();
        } catch (Exception e) {
        }//implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        if (props.size() > 0) {
            props.putAll(properties);
        }
        props.store(outputStream, "");
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        props.load(inputStream);
        Set<String> names = props.stringPropertyNames();
        for (String x : names) {
            properties.put(x, props.getProperty(x));
        }


        //implement this method - реализуйте этот метод
    }
}
