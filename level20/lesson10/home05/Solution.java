package com.javarush.test.level20.lesson10.home05;


import java.io.*;
import java.util.logging.Logger;

/* Сериализуйте Person
Сериализуйте класс Person стандартным способом. При необходимости поставьте полям модификатор transient.
*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;
        private static final long serialVersionUID = 1L;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.logger = Logger.getLogger(String.valueOf(Person.class));
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Solution sol = new Solution();
        String s = "d:\\test.txt";
        FileOutputStream fos = new FileOutputStream(s);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        Person p = new Person("Boris", "Ko4kin", "Russia", Sex.MALE);
        out.writeObject(p);
        fos.close();
        out.close();

        System.out.println(p.firstName + "\n" +
                p.lastName + "\n" +
                p.fullName + "\n" +
                p.greetingString + "\n" +
                p.country + "\n" +
                p.sex + "\n" +
                p.outputStream + "\n" +
                p.logger
        );

        FileInputStream fis = new FileInputStream(s);
        ObjectInputStream in = new ObjectInputStream(fis);
        Person p2 = (Person) in.readObject();

        System.out.println(p2.firstName + "\n" +
                p2.lastName + "\n" +
                p2.fullName + "\n" +
                p2.greetingString + "\n" +
                p2.country + "\n" +
                p2.sex + "\n" +
                p2.outputStream + "\n" +
                p2.logger
        );
        fis.close();
        in.close();


    }
}
