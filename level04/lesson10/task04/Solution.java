package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 10;
        int v = 10;
        while (i != 0) {
            while (v !=0) {
                System.out.print("S");
                v--;
            }
            System.out.println();
            v = 10;
            i--;//напишите тут ваш код
        }

    }
}
