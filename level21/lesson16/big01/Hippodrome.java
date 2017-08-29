package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Cheshirsky on 23.08.2016.
 */
public class Hippodrome {
    public static Hippodrome game;
    private ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse x : horses) {
            x.move();
        }
    }

    public void print() {
        for (Horse x : horses) {
            x.print();
            System.out.println();
            System.out.println();

        }
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (int i = 1; i < horses.size(); i++) {
            if (winner.getDistance() < horses.get(i).getDistance()) winner = horses.get(i);
        }
        return winner;
    }

    public void printWinner(){
        System.out.println(String.format("Winner is %s!", getWinner().getName()));

    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        Horse h1 = new Horse("Букашка", 3, 0);
        Horse h2 = new Horse("Промокашка", 3, 0);
        Horse h3 = new Horse("Кренделяшка", 3, 0);

        game.getHorses().add(h1);
        game.getHorses().add(h2);
        game.getHorses().add(h3);

        game.run();

        game.printWinner();
    }
}
