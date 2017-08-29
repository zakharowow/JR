package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = reader.readLine()).equals("exit")) {
            Thread th = new ReadThread(s);
            th.run();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) throws FileNotFoundException {
            this.fileName = fileName;//implement constructor body
        }

        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try {
                FileInputStream fis = new FileInputStream(fileName);
                ArrayList<Integer> list = new ArrayList<>();

                while (fis.available() > 0) {
                    list.add(fis.read());
                }
                int val = list.get(0);
                int kol = Collections.frequency(list, list.get(0));

                for (int i = 1; i < list.size(); i++) {
                    if (kol < Collections.frequency(list, list.get(i))) {
                        kol = Collections.frequency(list, list.get(i));
                        val = list.get(i);
                    }
                }
                resultMap.put(fileName, val);
                fis.close();

            } catch (IOException e) {
            }
        }


    }
}
