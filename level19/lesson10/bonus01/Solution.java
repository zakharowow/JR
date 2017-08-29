package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5

d:\test.txt

d:\test1.txt
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader readFile1 = new BufferedReader(new FileReader(file1));
        BufferedReader readFile2 = new BufferedReader(new FileReader(file2));

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        while (readFile1.ready()) {
            list1.add(readFile1.readLine());
        }
        while (readFile2.ready()) {
            list2.add(readFile2.readLine());
        }

        readFile1.close();
        readFile2.close();
        int i = 0;
        int j = 0;
        try {
            while(i < list1.size()-1){
                while(j < list2.size()-1) {

                    if (list1.get(i).equals(list2.get(j))) {
                        lines.add(new LineItem(Type.SAME, list1.get(i)));
                        System.out.println(Type.SAME + " " + list1.get(i));
                        i++;
                        j++;
                    }
                    if (list1.get(i + 1).equals(list2.get(j))) {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                        System.out.println(Type.REMOVED + " " + list1.get(i));
                        i++;
                    }

                    if (list1.get(i).equals(list2.get(j + 1))) {
                        lines.add(new LineItem(Type.ADDED, list2.get(j)));
                        System.out.println(Type.ADDED + " " + list2.get(j));
                        j++;
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {

                if (i == list1.size()) {
                    while (j < list2.size()) {
                        lines.add(new LineItem(Type.ADDED, list2.get(j)));
                        System.out.println(Type.ADDED + " " + list2.get(j));
                        j++;
                    }
                }

                if (j == list2.size()) {
                    while (i < list1.size()) {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                        System.out.println(Type.REMOVED + " " + list1.get(i));
                        i++;
                    }
                }
        }

    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
