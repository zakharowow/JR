package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine()); //напишите тут ваш код
        }


        for (int i = 1; i <= array.length/2; i++){
            int ch = array[i-1];
            array[i-1] = array[array.length - i];
            array[array.length - i] = ch;
        }

        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }
}
