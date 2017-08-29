package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<>();
        int [] one = new int [5];
        int [] two = new int [2];
        int [] three = new int [4];
        int [] four = new int [7];
        int [] five = new int [0];
        list.add(0 ,one);
        list.add(1, two);
        list.add(2, three);
        list.add(3, four);
        list.add(4, five);
        for (int[] x : list){
            for(int j = 0; j < x.length; j++){
                x[j] = j+5*j;
            }
        }
        return list;        //напишите тут ваш код

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
