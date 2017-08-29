package com.javarush.test.level17.lesson10.home09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.2. выбросить исключение CorruptedDataException
4.1. очистить allLines от данных
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
D:/test.txt
D:/test1.txt
D:/test2.txt
http://info.javarush.ru/JavaRush_tasks_discussion/2013/08/23/level17-lesson10-home09.html
Всем, у кого не получается, в этой теме есть все, что нужно для решения.
Но задание сформулировано неправильно:
а)«Сигнатуру метода main не менять» читать как «Сигнатуру метода joinData не менять»
б)Пункт 4.1 меняйте местами с 4.2
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String nameFile_1 = reader.readLine();
            String nameFile_2 = reader.readLine();

            BufferedReader file_1 = new BufferedReader(new FileReader(nameFile_1));
            BufferedReader file_2 = new BufferedReader(new FileReader(nameFile_2));

            String tmp;

            while ((tmp = file_1.readLine()) != null) {
                allLines.add(tmp);
            }

            while ((tmp = file_2.readLine()) != null) {
                forRemoveLines.add(tmp);
            }


        } catch (IOException e) {
        }

        Solution solution = new Solution();
        solution.joinData();



    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
