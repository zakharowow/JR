package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources

d:\test.txt.part1

*/

import java.io.*;
import java.util.TreeSet;

public class Solution {

    public static TreeSet<String> tree = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = "";
        while (!(filename = reader.readLine()).equals("end")) {
            tree.add(filename);
        }


        File fo = new File(createname());

        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(fo));

        for (String x : tree) {
            BufferedInputStream is = new BufferedInputStream(new FileInputStream(x));

            while (is.available() > 0) {
                os.write(is.read());
            }
            is.close();
        }
        os.close();
        reader.close();

    }

    public static String createname() {
        String s = tree.first();
        String out = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (String.valueOf(s.charAt(i)).equals(".")) {
                out = s.substring(0, i);
                break;
            }
        }
        return out;
    }
}
