package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();

        if (!s.isEmpty()) {

            String[] parts = s.substring(s.indexOf('?')+1).split("&");

            for (String x : parts) {

                if(x.contains("=")){
                    String [] ss = x.split("=");
                    names.add(ss[0]);
                    if(ss[0].equals("obj")){
                    values.add(ss[1]);}}
                else names.add(x);
            }//add your code here
        }

        for(String x : names){
            System.out.print(x + " ");
        }
        System.out.println();

        for(String x : values){
            try{alert(Double.parseDouble(x));}
            catch(Exception e){alert(x);}
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}


/*
Вот тебе линк для тестирования
javarush.ru/alpha/index.html?lvl=15&??view&&&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&&?oobj=3.0
А вот, результат который должен получиться
lvl view name obj name obj oobj
double 3.14
String djsdcd
 */