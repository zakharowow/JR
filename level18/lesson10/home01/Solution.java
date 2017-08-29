package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        int count = 0;
        while((s = reader.readLine()) != null){
            for(int i = 0; i < s.length(); i++){
                if(Character.toString(s.charAt(i)).matches("[A-Za-z]")){count++;}
            }
        }
        System.out.println(count);
        reader.close();
    }
}
