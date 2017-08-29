package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String a = read.readLine();
        String bb = read.readLine();
        int b = Integer.parseInt(bb);

        while (b != 0) {
            System.out.println(a);
            b--;
            //напишите тут ваш код
        }

    }
}
