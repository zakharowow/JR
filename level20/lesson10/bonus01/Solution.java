package com.javarush.test.level20.lesson10.bonus01;

import java.util.ArrayList;

/* Алгоритмы-числа
Число S состоит из M чисел, например, S=370 и M(количество цифр)=3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания

Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8

На выполнение дается 10 секунд и 50 МБ памяти.
*/
public class Solution {
    public static int[] getNumbers(int N) {

        int digits = String.valueOf(N).length();

        ArrayList<Integer> list = new ArrayList<>();

        long[] pows = new long[digits * 10];
        long res;
        int row = 0;
        for (int i = 1; i <= digits; i++) {
            for (int j = 0; j < 10; j++) {
                res = j;
                for (int h = 1; h < i; h++) {
                    res = res * j;
                }
                pows[row] = res;
                row++;
            }
        }
        int diglen = 10;
        int size = 1;

        for (int i = 1; i < N; i++) {
            int x = i;

            if (i / diglen == 0) {
                int arms = 0;

                while (x > 0) {
                    arms = arms + (int) pows[(size - 1) * 10 + x % 10];
                    if (arms > i) break;
                    x = x / 10;
                }
                if (arms == i) {
                    list.add(arms);
                }
            } else {
                diglen = diglen * 10;
                size++;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Long t0 = System.currentTimeMillis();
        int[] m = getNumbers(1147483647);
        Long t1 = System.currentTimeMillis();
        for (int a : m) {
            System.out.println(a);
        }
        System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024d) + " Mb.");
        System.out.println("Time: " + (t1 - t0) / 1000d + " sec.");
    }
}

