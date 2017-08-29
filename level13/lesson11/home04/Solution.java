package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String name = reader.readLine(); // прочитал имя файла с консоли
        //InputStream inStream = new FileInputStream("D:/test" + name + ".txt");

        ArrayList<String> list = new ArrayList<>();
        String s;
        do{s = reader.readLine(); list.add(s);}
        while(!s.equals("exit")); // считывание строки с консоли, пока !exit

        FileWriter fw = new FileWriter(name);
        for (int i = 0; i < list.size(); i++){
            if (i != list.size()-1) fw.write(list.get(i)+"\r\n");
            else fw.write(list.get(i));
        }

        //inStream.close();
        input.close();
        fw.close();

    }


}
