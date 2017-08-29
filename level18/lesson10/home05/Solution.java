package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedReader fileread = new BufferedReader(new FileReader(file1));
        BufferedWriter fw = new BufferedWriter(new FileWriter(file2));
        String s;

        while ((s = fileread.readLine()) != null) {
            String[] mass = s.split(" ");
            for (String x : mass) {
                fw.write(String.valueOf(Math.round(Float.parseFloat(x))));
                fw.append(' ');
            }
        }
        fw.flush();
        fw.close();
        reader.close();
        fileread.close();
    }
}
