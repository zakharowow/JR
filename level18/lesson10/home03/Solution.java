package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file_1 = new FileOutputStream(reader.readLine());
        FileInputStream file_2 = new FileInputStream(reader.readLine());
        FileInputStream file_3 = new FileInputStream(reader.readLine());

        writer(file_2, file_1);
        writer(file_3, file_1);

        reader.close();
        file_1.close();
        file_2.close();
        file_3.close();
    }

    static void writer  (FileInputStream filein, FileOutputStream fileout)throws IOException {
        while (filein.available() > 0){
            fileout.write(filein.read());
        }
    }
}
