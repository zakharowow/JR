package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Calendar c = new GregorianCalendar();
        int m;
        for (int i = 0; i < 12; i++){
            c.set(Calendar.MONTH, i);
            if (c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US).equalsIgnoreCase(s)){
                m = i+1;
                System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US) + " is " + m + " month");
            }
        }

        /*System.out.println();

        System.out.println();
        ArrayList list = new ArrayList();
        for (int i = 0; i < 12; i++)
        list.add(i);
        //SimpleDateFormat form = new SimpleDateFormat();
        //System.out.println(date + " is " + " month");*/

        //напишите тут ваш код
    }

}

