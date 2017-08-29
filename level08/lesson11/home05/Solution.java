package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuffer str = new StringBuffer(s);
        Character up;
        if (!s.startsWith(" ")){
            up = str.charAt(0);
            str.setCharAt(0, up.toUpperCase(str.charAt(0)));}

            for (int i = 1; i < str.length(); i++){
                if (str.charAt(i) != ' ' & str.charAt(i-1) == ' '){
                    up = str.charAt(i);
                    str.setCharAt(i, up.toUpperCase(str.charAt(i)));
                }
            }

            s = str.toString();
                System.out.println(s);
    }
}


