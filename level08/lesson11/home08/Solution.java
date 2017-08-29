package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        Arrays.sort(array);
        /*ArrayList<Integer> list = new ArrayList<>();
        for (int x : array){list.add(x);}
        int [] max = new int[5];
        int count = 0;
        max[0] = list.get(0);
        for (int i = 0; i < 5; i++) {
            for (int v = 1; v < list.size(); v++) {
                if (max[i] < list.get(v)) {max[i] = list.get(v); count = v;}
                    //напишите тут ваш код
            }
            list.remove(count);
        }
        for (int i = 0; i < 5; i++){array[i] = max[i];}*/
    }
}
