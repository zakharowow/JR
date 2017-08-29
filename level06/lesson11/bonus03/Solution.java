package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> massiv = new ArrayList(5);

        massiv.add(Integer.parseInt(reader.readLine()));
        massiv.add(Integer.parseInt(reader.readLine()));
        massiv.add(Integer.parseInt(reader.readLine()));
        massiv.add(Integer.parseInt(reader.readLine()));
        massiv.add(Integer.parseInt(reader.readLine()));

        for (int a = 1; a < 5; a++){
            for(int b = 4; b >= a; b--){
                if (massiv.get(b-1) > massiv.get(b)) {
                    int x = massiv.get(b-1);
                    massiv.set(b-1, massiv.get(b));
                    massiv.set(b, x);
                }
            }
        }


        for (int i = 0; i < 5; i++) System.out.println(massiv.get(i));//напишите тут ваш код
    }
}
