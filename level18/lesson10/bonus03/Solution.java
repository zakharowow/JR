package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234

-u 19846 hrenovina 123.30 99

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // args = new String[] {"-u", "12345678", "asdaskjфыдфлдыдфлыо", "121", "12"};
        // args = new String[] {"-d", "12345678"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        ArrayList<String> list = new ArrayList<>();

        BufferedReader readFile = new BufferedReader(new FileReader(fileName));
        String s;

        while ((s = readFile.readLine()) != null) {
            if (!s.equals("")) list.add(s);
        }
        readFile.close();

        if (args[0].equals("-d")) {
            for (int i = 0; i < list.size(); i++) {

                String idchek = "";
                if (list.get(i).length() > 7) idchek = (list.get(i).substring(0, 8));
                if (idchek.equals(formatSpaсe(args[1], 8))) {
                    list.remove(i);
                    break;
                }
            }
        }

        if (args[0].equals("-u")) {
            String id = formatSpaсe(args[1], 8);
            String product = formatSpaсe(args[2], 30);
            String price = formatSpaсe(args[3], 8);
            String quanity = formatSpaсe(args[4], 4);

            for (int i = 0; i < list.size(); i++) {
                String idchek = "";
                if (list.get(i).length() > 7) {
                    idchek = list.get(i).substring(0, 8);
                }
                if ((idchek.equals(formatSpaсe(args[1], 8)))) {
                    list.set(i, id + product + price + quanity);
                    break;
                }
            }
        }

        PrintWriter writeFile = new PrintWriter(fileName);
        for (String x : list) {
            writeFile.println(x);
        }
        writeFile.close();
    }

    public static String formatSpaсe(String product, int length) {
        if (product.length() < length) return String.format("%1$-" + length + "s", product);
        else
            return product.substring(0, length);
    }
}
