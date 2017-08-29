package com.javarush.test.level04.lesson16.home04;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = input.readLine();

        int y = Integer.parseInt(input.readLine());
        int m = Integer.parseInt(input.readLine());
        int d = Integer.parseInt(input.readLine());

        System.out.println("Меня зовут " + name);
        System.out.print("Я родился " + d + "." + m + "." + y);//напишите тут ваш код
    }
}
