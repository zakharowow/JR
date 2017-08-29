package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст,
жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[][] massiv = {{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"},
                {"ягода", "трава", "ягода", "фрукт", "овощ", "куст", "корень", "ягода", "цветок","клубень"}};//напишите тут ваш код

        Map<String, String> greens = new HashMap<String, String>();

        for (int a = 0; a < massiv[0].length; a++){
            greens.put(massiv[0][a],massiv[1][a]);
            }

        Iterator<Map.Entry<String, String>> iterator = greens.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> para = iterator.next();
            String key = para.getKey();
            String value = para.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
