package com.javarush.test.level20.lesson10.home02;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* Десериализация
На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуйте объект в методе getOriginalObject предварительно определив, какого именно типа там объект.
Реализуйте интерфейс Serializable где необходимо.
*/
public class Solution implements Serializable{
    private static final long serialVersionUID = 3L;
    public A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException {
        Object o = objectStream.readObject();
        if(o instanceof A) return (A)o;
        else {
            if (o instanceof B) return (B)o;
            else return null;
        }
    }

    public class A implements Serializable{
        private static final long serialVersionUID = 1L;

    }

    public class B extends A {
        private static final long serialVersionUID = 2L;
        public B() {
            System.out.println("inside B");
        }
    }

}
