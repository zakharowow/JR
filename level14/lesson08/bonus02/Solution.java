package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(MaximDelitel(a, b));
    }

        static int MaximDelitel (int a, int b) {
            int out = 0;
            for (int i = Math.min(a, b); i > 0; i--) {
                if (a % i == 0 & b % i == 0) {
                    out = i; break;
                }
            }

            return out;
        }
}
