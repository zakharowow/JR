package com.javarush.test.level19.lesson10.bonus03;

/* Знакомство с тегами
Считайте с консоли имя файла, который имеет HTML-формат
Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span><span>Super</span><span>girl</span>
Первым параметром в метод main приходит тег. Например, "span"
Вывести на консоль все теги, которые соответствуют заданному тегу
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле
Количество пробелов, \n, \r не влияют на результат
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нету
Тег может содержать вложенные теги
Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>
<span>Super</span>
<span>girl</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми

d:\test.html

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader readFile = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        while (readFile.ready()) {
            sb.append((char) readFile.read());
        }
        readFile.close();

        String text = sb.toString().replaceAll("[\\n\\r]", "");
        String teg = args[0];
        ArrayList<String> map = new ArrayList<>();

        try {
            for (int i = 0; i < text.length(); i++) {
                if (text.substring(i, i + teg.length() + 1).equals("<" + teg)) {
                    map.add("b" + i);
                }
                if (text.substring(i, i + teg.length() + 2).equals("</" + teg)) {
                    map.add("e" + (i + teg.length() + 2));
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
        }


        for (int begin = 0; begin < map.size() - 1; begin++) {
            try {
                if (map.get(begin).contains("b")) {

                    int end = closeTagNum(map, begin);

                    int first = Integer.valueOf(map.get(begin).substring(1));
                    int last = Integer.valueOf(map.get(end).substring(1));

                    System.out.println(text.substring(first, last + 1));

                }
            } catch (IndexOutOfBoundsException e) {

            }
        }
    }

    public static int closeTagNum(ArrayList<String> list, int from) {
        int end = 0;
        int begins = 0;
        int ends = 0;
        for (int i = from; i < list.size(); i++) {
            if (list.get(i).contains("b")) begins++;
            if (list.get(i).contains("e")) ends++;
            if (begins == ends) {
                end = i;
                break;
            }
        }
        return end;
    }

}



