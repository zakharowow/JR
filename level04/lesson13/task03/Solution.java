package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       for (int i = 1; i <= 10; i++){
           for (int b = 1; b <= i; b++) {
               System.out.print("8");//напишите тут ваш код
           }
           System.out.println();
       }

    }
}
