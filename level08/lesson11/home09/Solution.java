package com.javarush.test.level08.lesson11.home09;

import java.util.Date;/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        //String date = "JANUARY 2 2000";
        //System.out.println(isDateOdd(date));
    }

    public static boolean isDateOdd(String date)
    {
        Date now = new Date(date);
        Date start = new Date(date);
        //System.out.println("now " + now);
        start.setDate(1);
        start.setMonth(0);
        //System.out.println("start " + start);
        long ms = now.getTime() - start.getTime();
        long days = 1000*60*60*24;
        if ((ms / days + 1) % 2  == 0) return false;
        else return true;
    }
}
