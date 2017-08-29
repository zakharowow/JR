package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        String xx = read.readLine();
        int x = Integer.parseInt(xx);
        boolean a, b, c, d, e;
        a = (x < 0) & ((x % 2) == 0);
        b = (x < 0) & ((x % 2) != 0);
        c = (x == 0);
        d = (x > 0) & ((x % 2) == 0);
        e = (x > 0) & ((x % 2) != 0);

        if (a) System.out.println("отрицательное четное число");
        if (b) System.out.println("отрицательное нечетное число");
        if (c) System.out.println("нулевое число");
        if (d) System.out.println("положительное четное число");
        if (e) System.out.println("положительное нечетное число");

        //напишите тут ваш код

    }
}
