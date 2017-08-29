package com.javarush.test.level19.lesson10.home09;

/* Контекстная реклама
В методе main подмените объект System.out написанной вами реадер-оберткой
Ваша реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Рекламный текст: "JavaRush - курсы Java онлайн"

Пример вывода:
first
second
JavaRush - курсы Java онлайн
third
fourth
JavaRush - курсы Java онлайн
fifth
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
        String res = array.toString();
        String[] s = res.split("\\n");
        System.setOut(original);

        int count = 0;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            count++;
            if (count == 2) {
                System.out.println("JavaRush - курсы Java онлайн");
                count = 0;

            }
        }

        original.close();
        array.close();
        adapter.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
