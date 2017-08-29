package com.javarush.test.level17.lesson10.bonus01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {

        int id;
        Date db;
        Sex sex;
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        if (args.length > 0) {
            switch (args[0]) {
                case "-c": // -c name sex bd

                    Person person = null;

                    if (args[2].equals("м")) {
                        person = Person.createMale(args[1], dateformat.parse(args[3]));
                    } else {
                        person = Person.createFemale(args[1], dateformat.parse(args[3]));
                    }
                    allPeople.add(person);
                    System.out.println(allPeople.indexOf(person));

                    break;

                case "-u": //-u id name sex bd

                    id = Integer.valueOf(args[1]);

                    if (args[3].equals("м")) sex = Sex.MALE;
                    else sex = Sex.FEMALE;

                    allPeople.get(id).setName(args[2]);
                    allPeople.get(id).setSex(sex);
                    allPeople.get(id).setBirthDay(dateformat.parse(args[4]));
                    break;

                case "-d":
                    id = Integer.valueOf(args[1]);
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setBirthDay(null);
                    allPeople.get(id).setSex(null);
                    break;

                case "-i":

                    id = Integer.valueOf(args[1]);
                    db = allPeople.get(id).getBirthDay();

                    if (allPeople.get(id).getSex() == Sex.MALE) {
                        System.out.println(allPeople.get(id).getName() + " " + "м" + " " + dateformat2.format(db));
                    } else {
                        System.out.println(allPeople.get(id).getName() + " " + "ж" + " " + dateformat2.format(db));
                    }

                    break;

            }
        }


        //start here - начни тут
    }


}
