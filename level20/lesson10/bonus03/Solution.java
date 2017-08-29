package com.javarush.test.level20.lesson10.bonus03;

import java.util.ArrayList;
import java.util.List;

/* Кроссворд
1. Дан двумерный массив, который содержит буквы английского алфавита в нижнем регистре.
2. Метод detectAllWords должен найти все слова из words в массиве crossword.
3. Элемент(startX, startY) должен соответствовать первой букве слова, элемент(endX, endY) - последней.
text - это само слово, располагается между начальным и конечным элементами
4. Все слова есть в массиве.
5. Слова могут быть расположены горизонтально, вертикально и по диагонали как в нормальном, так и в обратном порядке.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> www = detectAllWords(crossword, "home", "same");
        for (Word x : www) {
            System.out.println(x);
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        ArrayList<Word> list = new ArrayList<>();

        String stmpgor = "";
        String stmpvert = "";
        String stmpdiag1 = "";
        String stmpdiag2 = "";


        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[i].length; j++) {
                try {
                    for (String word : words) {
                        for (int x = 0; x < word.length(); x++) {
                            try {
                                stmpgor = stmpgor + (char) crossword[i][j + x];
                            } catch (IndexOutOfBoundsException e) {
                            }
                            try {
                                stmpvert = stmpvert + (char) crossword[i + x][j];
                            } catch (IndexOutOfBoundsException e) {
                            }
                            try {
                                stmpdiag1 = stmpdiag1 + (char) crossword[i + x][j + x];
                            } catch (IndexOutOfBoundsException e) {
                            }
                            try {
                                stmpdiag2 = stmpdiag2 + (char) crossword[i - x][i + x];
                            } catch (IndexOutOfBoundsException e) {
                            }
                        }

                        if (stmpgor.equals(word)) {
                            Word w = new Word(word);
                            w.setStartPoint(j,i);
                            w.setEndPoint(j + word.length() - 1,i);
                            list.add(w);
                        } else {
                            StringBuilder sb = new StringBuilder(stmpgor);
                            stmpgor = sb.reverse().toString();
                            if (stmpgor.equals(word)) {
                                Word w = new Word(word);
                                w.setEndPoint(j,i);
                                w.setStartPoint(j + word.length() - 1,i);
                                list.add(w);
                            }
                        }

                        if (stmpvert.equals(word)) {
                            Word w = new Word(word);
                            w.setStartPoint(j, i);
                            w.setEndPoint(j, i + word.length() - 1);
                            list.add(w);
                            System.out.println(word);
                        }else {
                            StringBuilder sb = new StringBuilder(stmpvert);
                            stmpvert = sb.reverse().toString();
                            if (stmpvert.equals(word)) {
                                Word w = new Word(word);
                                w.setEndPoint(j,i);
                                w.setStartPoint(j, i + word.length() - 1);
                                list.add(w);
                            }
                        }

                        if (stmpdiag1.equals(word)) {
                            Word w = new Word(word);
                            w.setStartPoint(j, i);
                            w.setEndPoint(j + word.length() - 1, i + word.length() - 1);
                            list.add(w);
                            System.out.println(word);
                        }else {
                            StringBuilder sb = new StringBuilder(stmpdiag1);
                            stmpdiag1 = sb.reverse().toString();
                            if (stmpdiag1.equals(word)) {
                                Word w = new Word(word);
                                w.setEndPoint(j, i);
                                w.setStartPoint(j + word.length() - 1, i + word.length() - 1);
                                list.add(w);
                            }
                        }

                        if (stmpdiag2.equals(word)) {
                            Word w = new Word(word);
                            w.setStartPoint(j, i);
                            w.setEndPoint(j + word.length() - 1, i - word.length() - 1);
                            list.add(w);
                            System.out.println(word);
                        }else {
                            StringBuilder sb = new StringBuilder(stmpdiag2);
                            stmpdiag2 = sb.reverse().toString();
                            if (stmpdiag2.equals(word)) {
                                Word w = new Word(word);
                                w.setEndPoint(j, i);
                                w.setStartPoint(j + word.length() - 1, i - word.length() - 1);
                                list.add(w);
                            }
                        }

                        stmpgor = "";
                        stmpvert = "";
                        stmpdiag1 = "";
                        stmpdiag2 = "";
                    }
                } catch (IndexOutOfBoundsException e) {
                }

            }
        }
        return list;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
