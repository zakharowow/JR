package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
   public int top, left, width, height;

    public void initialize () {
        this.left = 5;
        this.top = 10;
        this.width = 60;
        this.height = 20;
    }

    public void initialize (int top, int left) {
        this.width = 0;
        this.height = 0;
        this.top = top;
        this.left = left;
    }


    public void initialize (int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.height = this.width = width;
    }

    public void initialize (int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
}
