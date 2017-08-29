package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String aa = reader.readLine();
        int a = Integer.parseInt(aa);
        String bb = reader.readLine();
        int b = Integer.parseInt(bb);
        String cc = reader.readLine();
        int c = Integer.parseInt(cc);

        int x, y;

        x = max (a,b,c);
        y = min (a,b,c);

        if (a < x & a > y) System.out.println(x + " " + a + " " + y);
        else {
            if (b < x & b >y) System.out.println(x + " " + b + " " + y);
            else System.out.println(x + " " + c + " " + y);
        }


    }
    public static int max (int x, int y, int z){
        if (x > y & x > z) return x;
        else {
            if (y > x & y > z) return y;
            else return z;
        }
    }
    public static int min (int x, int y, int z){
        if (x < y & x < z) return x;
        else {
            if (y < x & y < z) return y;
            else return z;
        }
    }
}
