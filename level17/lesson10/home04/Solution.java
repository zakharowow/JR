package com.javarush.test.level17.lesson10.home04;

/* Синхронизированные методы
Установить модификатор synchronized только тем методам, которым необходимо.
Объект класса Solution будет использоваться нитями.
*/

public class Solution {
    private double param = Math.random(); // создаётся обцая переменная
    private StringBuilder sb = new StringBuilder(); // создаётся общая строка

    private void method0() {
        double i = method3();
    } // вызывается метод 3

    protected synchronized void method1(String param1) { // создаётся новый объект класса и вызывается метод 0
        Solution solution = new Solution();
        solution.method0();
    }

    public void method2(int param1) {
        param1++;
    } // в метод передаётся переменная, которая инкрементируется

    synchronized double method3() { // методы вызывается в методе 0
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    } // созадаётся строка

    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2); // создаётся строка
    }

    synchronized public String method6(int param2) { //
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

}
