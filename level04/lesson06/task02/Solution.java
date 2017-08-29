package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        double a = Double.parseDouble(aa);
        String bb = reader.readLine();
        double b = Double.parseDouble(bb);
        String cc = reader.readLine();
        double c = Double.parseDouble(cc);
        String dd = reader.readLine();
        double d = Double.parseDouble(dd);

        double x, y;
        x = primer(a, b);
        y = primer(c, d);

        if (x > y) System.out.println(x);
        else System.out.println(y);

    }

    public static double primer(double x, double y){
    if (x > y) return x;
    else return y;
    }

        //напишите тут ваш код



}
