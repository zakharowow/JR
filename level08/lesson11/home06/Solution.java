package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution
{
    public static void main(String[] args)
    {
        Human grandpa1 = new Human("Петя", true, 88);
        Human grandpa2 = new Human("Вася", true, 77);
        Human grandma1 = new Human("Катя", false, 66);
        Human grandma2 = new Human("Люся", false, 55);
        Human father = new Human("Ярик", true, 44);
        Human mother = new Human("Саша", false, 33);
        /*Human ch = new Human("Дитя", false, 22);
        Human ch2 = new Human("Дитя2", false, 11);
        Human ch3 = new Human("Дитя3", false, 01);*/
        List<Human> children = new ArrayList<>(Arrays.asList(new Human("Дитя", false, 22), new Human("Дитя2", false, 11), new Human("Дитя3", false, 01)));
        List<Human> all = Arrays.asList(grandpa1, grandpa2, grandma1, grandma2, father, mother, children.get(0),children.get(1), children.get(0));
        System.out.println(all);
       //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, Boolean sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
        }//напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
