package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader (System.in));
        String aa = read.readLine();
        int a = Integer.parseInt(aa);
        String bb = read.readLine();
        int b = Integer.parseInt(bb);
        String cc = read.readLine();
        int c = Integer.parseInt(cc);

        int i;

        i = minus(a) + minus(b) + minus(c);

        System.out.println(i);
        //напишите тут ваш код

    }
    public static int minus (int x) {
        if (x > 0) return 1;
                else return 0;
    }
}
