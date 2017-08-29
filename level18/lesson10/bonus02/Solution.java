package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно,
инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/


import java.io.*;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        String productName = chekSpaсe(args[1], 30);
        String price = chekSpaсe(args[2], 8);
        String quantity = chekSpaсe(args[3], 4);
        String id = chekSpaсe(makeid(filename), 8);

        PrintWriter writefile = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));
        writefile.println(id + productName + price + quantity);

        writefile.close();
    }

    public static String makeid(String filename) throws IOException {
        BufferedReader readfile = new BufferedReader(new FileReader(filename));
        String s;
        TreeSet<String> tree = new TreeSet<>();
        while ((s = readfile.readLine()) != null) {
            if (!s.isEmpty()) {
                tree.add(s.substring(0, 8).replaceAll("\\s", ""));
            }
        }
        readfile.close();

        String id = String.valueOf(Integer.parseInt(tree.last()) + 1);
        return id;
    }

    public static String chekSpaсe(String product, int length) {
        if (product.length() < length) return String.format("%1$-" + length + "s", product);
        else
            return product.substring(0, length);
    }
}

