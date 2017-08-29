package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
D://test.txt
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        StringBuilder sb = new StringBuilder();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()) {
            sb.append(fileReader.readLine() + " ");
        }



        String[] array = sb.toString().split("\\s+");



        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].equals((new StringBuilder(array[j]).reverse()).toString()) && !nums.contains(i)) {
                    result.add(new Pair(array[i], array[j])); nums.add(j);
                    break;
                }
            }
        }

        for (Pair x : result){
            System.out.println(x.toString());
        }

    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
