package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Calendar calendar = new GregorianCalendar();

        String s = "";
        while ((s = reader.readLine()) != null) {
            String[] data = s.split(" ");
            String name = "";

            for (int i = 0; i < data.length-2; i++) {
                try {
                    int day = Integer.parseInt(data[i]);
                    int month = Integer.parseInt(data[i + 1])-1;
                    int year = Integer.parseInt(data[i + 2]);
                    calendar.set(year, month, day);
                } catch (Exception e) {
                    name = name + data[i] + " ";
                }

            }
            name = name.substring(0, name.length()-1);

            PEOPLE.add(new Person(name, calendar.getTime()));
        }
        reader.close();
    }
}
