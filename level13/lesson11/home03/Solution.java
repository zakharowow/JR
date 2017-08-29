package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(stream);
        String s = reader.readLine();

        InputStream inStream = new FileInputStream(s);
        OutputStream print = new PrintStream(System.out);

        while (inStream.available() > 0){
            int data = inStream.read();
            print.write(data);

        }//add your code here
        stream.close();
        inStream.close();
        print.close();

    }
}

//D:/test.txt