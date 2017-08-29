package com.javarush.test.level26.lesson02.task01;

import java.util.Arrays;
import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution {

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        double median = (array.length % 2 != 0) ? array[array.length / 2] : ((double)(array[array.length / 2 - 1] + array[array.length / 2]) / 2);
        Comparator<Integer> compareArray = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };///implement logic here
        Arrays.sort(array, compareArray);
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        System.out.println("До сортировки: " + Arrays.asList(array));
        sort(array);
        System.out.println();
        System.out.println("После сортировки: " + Arrays.asList(array));
    }
}
