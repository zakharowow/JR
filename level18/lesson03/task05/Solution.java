package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream readfile = new FileInputStream(reader.readLine());

        TreeSet<Integer> tree = new TreeSet<>();

        while(readfile.available() > 0){
            tree.add(readfile.read());
        }

        for(Integer x : tree){
            System.out.print(x + " ");
        }

        reader.close();
        readfile.close();
    }
}
