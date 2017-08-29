package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int X, Y, R, W;
    String C;

    public Circle(int X, int Y, int R){
        this.X = X;
        this.Y = Y;
        this.R = R;
    }

    public Circle(int X, int Y, int R, int W){
        this.X = X;
        this.Y = Y;
        this.R = R;
        this.W = W;
    }

    public Circle(int X, int Y, int R, int W, String C){
        this.X = X;
        this.Y = Y;
        this.R = R;
        this.W = W;
        this.C = C;
    }


    //напишите тут ваш код

}
