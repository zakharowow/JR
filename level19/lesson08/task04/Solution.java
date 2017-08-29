package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream original = System.out;
        ByteArrayOutputStream array = new ByteArrayOutputStream();
        PrintStream adapter = new PrintStream(array);
        System.setOut(adapter);
        testString.printSomething();
        String s = array.toString();

        String[] m = s.split("[\\s]");

        int res = 0;
        switch (m[1]) {
            case "+":
                res = Integer.parseInt(m[0]) + Integer.parseInt(m[2]);
                break;
            case "-":
                res = Integer.parseInt(m[0]) - Integer.parseInt(m[2]);
                break;
            case "*":
                res = Integer.parseInt(m[0]) * Integer.parseInt(m[2]);
                break;
        }

        System.setOut(original);
        System.out.println(s + String.valueOf(res));
        original.close();
        array.close();
        adapter.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

