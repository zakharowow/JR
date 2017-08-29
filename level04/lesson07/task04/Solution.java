package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        String aa = read.readLine();
        int a = Integer.parseInt(aa);
        String bb = read.readLine();
        int b = Integer.parseInt(bb);
        String cc = read.readLine();
        int c = Integer.parseInt(cc);
        int pol, otr;

        pol = plus(a) + plus(b) + plus(c);
        otr = minus(a) + minus(b) + minus(c);
        System.out.println("количество отрицательных чисел: " + otr);
        System.out.println("количество положительных чисел: " + pol);//напишите тут ваш код

    }
    public static byte plus (int i){
        if (i > 0) return 1;
        else return 0;
    }

    public static byte minus (int i){
        if (i < 0) return 1;
        else return 0;
    }
}
