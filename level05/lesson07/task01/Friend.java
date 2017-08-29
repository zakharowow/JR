package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    public String friend = null;

    public void initialize (String name) {
        this.friend = name;
}

    public void initialize (String name, int age) {
        this.friend = name + age;
    }

    public void initialize (String name, int age, String pol) {
        this.friend = name + age + pol;
    }//напишите тут ваш код
}
