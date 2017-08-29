package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {//напишите тут ваши переменные и конструкторы
        String name;
        String surname;
        int age;
        String birth;
        String address;
        int insurcard;

        public Human(String name, String surname, int age, String birth, String address, int insurcard){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.birth = birth;
            this.address = address;
            this.insurcard = insurcard;
        }
        public Human(String name, String surname, int age, String birth, String address){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.birth = birth;
            this.address = address;
        }
        public Human(String name, String surname, int age, String birth){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.birth = birth;
        }
        public Human(String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
        public Human(String name, String surname){
            this.name = name;
            this.surname = surname;
        }
        public Human(String name){
            this.name = name;
        }
        public Human(String surname, int age, String birth, String address, int insurcard){
            this.surname = surname;
            this.age = age;
            this.birth = birth;
            this.address = address;
            this.insurcard = insurcard;
        }
        public Human(int age, String birth, String address, int insurcard){
            this.age = age;
            this.birth = birth;
            this.address = address;
            this.insurcard = insurcard;
        }
        public Human(String birth, String address, int insurcard, int age){
            this.birth = birth;
            this.address = address;
            this.insurcard = insurcard;
            this.age = age;
        }
        public Human(String address, int insurcard){
            this.address = address;
            this.insurcard = insurcard;
        }
    }
}
