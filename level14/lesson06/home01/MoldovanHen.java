package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Чеширский on 20.03.2016.
 */
public class MoldovanHen extends Hen {
    int getCountOfEggsPerMonth(){return 12; }
    String getDescription(){return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());}
}
