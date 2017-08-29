package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readFile = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writeFile = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();
        String s = "";
        while (readFile.ready()) {
            if (!(s = readFile.readLine()).isEmpty()) {
                String[] line = s.split(" ");
                for (int i = 0; i < line.length; i++) {
                    if (line[i].matches(".+[0-9].+")){
                        sb.append(line[i] + " ");}
                }
            }
        }
        writeFile.write(sb.toString());

        readFile.close();
        writeFile.close();
    }
}
