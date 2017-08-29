package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        String xx = read.readLine();
        int x = Integer.parseInt(xx);
        String y = Integer.toString(x);
        boolean a, b, c, d, e, f, dia;
        a = (x % 2 == 0) & (y.length() == 1);
        b = (x % 2 != 0) & (y.length() == 1);
        c = (x % 2 == 0) & (y.length() == 2);
        d = (x % 2 != 0) & (y.length() == 2);
        e = (x % 2 == 0) & (y.length() == 3);
        f = (x % 2 != 0) & (y.length() == 3);
        dia = (x >= 1) & (x <= 999);

        if (dia & a) System.out.println("четное однозначное число");//напишите тут ваш код
        if (dia & b) System.out.println("нечетное однозначное число");
        if (dia & c) System.out.println("четное двузначное число");
        if (dia & d) System.out.println("нечетное двузначное число");
        if (dia & e) System.out.println("четное трехзначное число");
        if (dia & f) System.out.println("нечетное трехзначное число");
    }


    }

