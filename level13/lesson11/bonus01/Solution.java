package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        BufferedReader inStream = new BufferedReader(new FileReader(name));
        // напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();
        TreeSet<Integer> tree = new TreeSet<>();
        String s;
        while ((s = inStream.readLine()) != null) {
            list.add(s);
        }

       for (int i = 0; i < list.size(); i++){
            if(Integer.parseInt(list.get(i))%2 == 0){tree.add(Integer.parseInt(list.get(i)));}
        }

        for(int x : tree){
            System.out.println(x);
        }
    }
}


//  D:/test.txt