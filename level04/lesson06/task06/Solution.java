package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        String name = read.readLine();
        String age = read.readLine();
        int a = Integer.parseInt(age);

        if (a > 20) System.out.println("И 18-ти достаточно");//напишите тут ваш код

    }
}
