package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public String dog = null;

    public void initialize(String name) {
    this.dog = name;
}

    public void initialize(String name, int height) {
        this.dog = name + height;
    }

    public void initialize(String name, int height, String colour) {
        this.dog = name + height + colour;
    }//напишите тут ваш код

}
