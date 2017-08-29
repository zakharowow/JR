package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        method2();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;//напишите тут ваш код

    }

    public static StackTraceElement[] method2()
    {
        method3();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();//напишите тут ваш код
        return stack;
    }

    public static StackTraceElement[] method3()
    {
        method4();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();//напишите тут ваш код
        return stack;
    }

    public static StackTraceElement[] method4()
    {
        method5();
       StackTraceElement[] stack = Thread.currentThread().getStackTrace();//напишите тут ваш код
        return stack;
    }

    public static StackTraceElement[] method5()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();//напишите тут ваш код
        return stack;
    }
}
