package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        String mm = input.readLine();
        int m = Integer.parseInt(mm);
        String nn = input.readLine();
        int n = Integer.parseInt(nn);
        int i, ii;

        for (i = m; i != 0; i--) {
            for (ii = n; ii != 0; ii--){
                System.out.print("8");
            }
            ii = n;
            System.out.println();

        }
        //напишите тут ваш код

    }
}
