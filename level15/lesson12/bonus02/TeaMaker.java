package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Чеширский on 15.04.2016.
 */
public class TeaMaker extends DrinkMaker {
    void getRightCup(){
        System.out.println("Берем чашку для чая");
    }
    void putIngredient(){
        System.out.println("Насыпаем чай");
    }
    void pour(){
        System.out.println("Заливаем водой");
    }
}
