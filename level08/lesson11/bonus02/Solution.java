package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> address = new ArrayList<>();
        List<String> families = new ArrayList<>();
        while (true)
        {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            address.add(city);
            families.add(reader.readLine());

        }

        //read home number
        String vvod = reader.readLine();

        for (int i = 0; i < address.size(); i++)
        {
            if(address.get(i).equals(vvod)) System.out.println(families.get(i));
        }
    }
}
