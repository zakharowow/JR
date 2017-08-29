package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();//напишите тут ваш код
        list.add(0, "мама");
        list.add(1, "мыла");
        list.add(2, "раму");

        int x = 1;
        for (int i = 0; i < 3; i++){
            list.add(i+x, "именно");
            x++;
        }

        for (String i : list){
            System.out.println(i);
        }
    }
}
