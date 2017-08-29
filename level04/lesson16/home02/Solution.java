package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String aa = input.readLine();
        int a = Integer.parseInt(aa);
        String bb = input.readLine();
        int b = Integer.parseInt(bb);
        String cc = input.readLine();
        int c = Integer.parseInt(cc);

        if ((a >= b & a <= c) || (a <= b & a >= c)) System.out.println(a);
        else {
            if ((b >= a & b <= c) || (b <= a & b >= c)) System.out.println(b);
            else System.out.println(c);
        }
        //напишите тут ваш код
    }
}
