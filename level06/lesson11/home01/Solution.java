package com.javarush.test.level06.lesson11.home01;

/* Класс Cat и статическая переменная catCount
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i = 10;
        while (i > 0){
            Cat cat = new Cat();
            i--;//Cоздай тут 10 объектов Cat
        }

        System.out.println(Cat.catCount);//Выведи тут на экран catCount
    }

    public static class Cat
    {
        public static int catCount = 0;//Cоздай тут статическую переменную

        public Cat(){
            Cat.catCount++;
        }
        //Создай тут конструктор
    }

}
