package com.javarush.test.level20.lesson10.home03;


import java.io.*;

/* Найти ошибки
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найдите проблему и исправьте ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
Сигнатура класса В не содержит ошибку :)
Метод main не участвует в тестировании.
*/
public class Solution implements Serializable {

    public static class A {
        public A(){}
        protected String name = "A";

        public A(String name) {
            this.name += name;
        }
    }

    public class B extends A implements Serializable {
        public B(String name) {
            super(name);
            this.name += name;
        }

        private void writeObject (ObjectOutputStream out) throws IOException{
            out.writeObject(name);
        }
        private void readObject (ObjectInputStream in) throws IOException, ClassNotFoundException {
            name = (String)in.readObject();

        }

    }

    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        Solution.A a = new A();
        Solution.B b = sol.new B(a.name);
        Solution.B btest;
        try(FileOutputStream fos = new FileOutputStream("test.txt");
        FileInputStream fis = new FileInputStream("test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ObjectInputStream ois = new ObjectInputStream(fis);){
            oos.writeObject(b);

        btest = (B)ois.readObject();
            System.out.println(a.name);
            System.out.println(b.name);
            System.out.println(btest.name);}
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
