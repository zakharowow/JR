package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Разрешите клонировать класс А
Запретите клонировать класс B
Разрешите клонировать класс C
Метод main не участвует в тестировании.
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public Object clone () throws CloneNotSupportedException{return super.clone();}
    }

    static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Object clone () throws CloneNotSupportedException {throw new CloneNotSupportedException();}
    }

    public static class C extends B implements Cloneable {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        public Object clone (){

            C clC = new C(super.getI(), super.getJ(), super.name);
            return clC;}
    }

    public static void main(String[] args) {
        A a = new A(1, 1);
        B b = new B(2, 2, "B");
        C c = new C(3, 3, "C");
        A clA = null;
        C clC = null;

        try {
            clA = (A)a.clone();
            clC = (C)c.clone();
        }
        catch (CloneNotSupportedException e){ e.printStackTrace(System.err);}

        System.out.println(a);
        System.out.println(clA + " " + clA.getI() + " " + clA.getJ());
        System.out.println(b);
        System.out.println(c);
        System.out.println(clC + " " + clC.getI() + " " + clC.getJ());

    }
}
