package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader dennedeli = new BufferedReader (new InputStreamReader (System.in));
        String nden = dennedeli.readLine();
        int den = Integer.parseInt(nden);

        if (den == 1) System.out.println("понедельник");
        else {
            if (den == 2) System.out.println("вторник");
            else {
                if (den == 3) System.out.println("среда");
                else {
                    if (den ==4) System.out.println("четверг");
                    else {
                        if (den == 5) System.out.println("пятница");
                        else {
                            if (den == 6) System.out.println("суббота");
                            else {
                                if (den == 7) System.out.println("воскресенье");
                                else System.out.println("такого дня недели не существует");
                            }
                        }
                    }
                }
            }
        }
        //напишите тут ваш код

    }

}