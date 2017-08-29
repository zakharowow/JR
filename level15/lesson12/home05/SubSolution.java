package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Чеширский on 29.03.2016.
 */
public class SubSolution extends Solution {
    public SubSolution() {
    }

    public SubSolution(String s) {
        super(s);
    }

    public SubSolution(int i) {
        super(i);
    }

    private SubSolution(int i, int x){super();}
    private SubSolution(String s, int i){super();}
    private SubSolution(int x, String s){super();}

    protected SubSolution(int i, int x, String s) {
        super(i, x, s);
    }

    protected SubSolution(int i, String s, int x) {
        super(i, s, x);
    }

    protected SubSolution(String s, int i, int x) {
        super(s, i, x);
    }

    SubSolution(int i, int x, int r) {
        super(i, x, r);
    }

    SubSolution(int i, String x, String r) {
        super(i, x, r);
    }

    SubSolution(String x, String r) {
        super(x, r);
    }


}
