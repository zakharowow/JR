package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file_1 = new FileInputStream(reader.readLine());
        FileOutputStream file_2 = new FileOutputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        while (file_1.available() > 0){
            list.add(file_1.read());
        }
        for(int i = list.size()-1; i >= 0; i--){
            file_2.write(list.get(i));
        }

        reader.close();
        file_1.close();
        file_2.close();
    }
}
