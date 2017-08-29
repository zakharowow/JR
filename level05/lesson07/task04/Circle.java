package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    public String circle = null;

    public void initialize(int centerX, int centerY, int radius) {
        this.circle = Integer.toString(centerX + centerY + radius);
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.circle = Integer.toString(centerX + centerY + radius + width);
    }

    public void initialize(int centerX, int centerY, int radius, int width, String color) {
        this.circle = Integer.toString (centerX + centerY + radius + width) + color;
    }//напишите тут ваш код

}
