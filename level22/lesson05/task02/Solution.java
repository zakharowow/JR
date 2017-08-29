package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
(string.indexOf('\t') == string.lastIndexOf('\t'))
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        int first, last;

        if ((string == null) || (string.length() <= 0) || (string.indexOf('\t') == -1) || (string.indexOf('\t') == string.lastIndexOf('\t')))
        throw new TooShortStringException();

        first = string.indexOf('\t');
        last = string.indexOf('\t', string.indexOf('\t') + 1);
        return last - first == 1 ? "" : string.substring(first+1,last);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
