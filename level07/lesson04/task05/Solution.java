package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) array[i] = Integer.parseInt(reader.readLine());

        int[] lit1 = new int[10];
        int [] lit2 = new int[10];

        for (int i = 0; i < array.length; i++){
            if (i >= array.length/2) {
                for (int a = 0; a < lit2.length; a++) lit2[a] = array[array.length/2+a];
            }
            else {
                for(int b = 0; b <lit2.length; b++) lit1[b] = array[b];//напишите тут ваш код
            }
        }

        for (int b = 0; b < lit2.length; b++) System.out.println(lit2[b]);

    }
}
