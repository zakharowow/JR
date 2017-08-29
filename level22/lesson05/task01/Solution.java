package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.length() <= 0) throw new TooShortStringException();
        int first = string.indexOf(' ');
        int flag = 0;
        String out = null;
        if (first != -1) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ' & flag < 5) flag++;
                if (flag == 4 && string.lastIndexOf(' ') == i) {out = string.substring(first + 1); break;}
                if (flag == 5) {out = string.substring(first + 1, i); break;}
            }
        } else throw new TooShortStringException();

        if (flag < 4) throw new TooShortStringException();
        else return out;

    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
}
