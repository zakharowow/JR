package com.javarush.test.level17.lesson10.bonus02;

import com.javarush.test.level17.lesson10.bonus01.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = null;
        int id;
        Date db;

        if (args.length > 0) {
            switch (args[0]) {

                case "-c": // -c name sex bd
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            person = Person.createMale(args[i], dateformat.parse(args[i + 2]));
                        } else {
                            person = Person.createFemale(args[i], dateformat.parse(args[i + 2]));
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));

                    }
                    break;

                case "-u": //-u id name sex bd
                    for (int i = 1; i < args.length; i +=4) {

                        Sex sex;
                        id = Integer.valueOf(args[i]);

                        if (args[i + 2].equals("м")) sex = Sex.MALE;
                        else sex = Sex.FEMALE;

                        allPeople.get(id).setName(args[i + 1]);
                        allPeople.get(id).setSex(sex);
                        allPeople.get(id).setBirthDay(dateformat.parse(args[i + 3]));
                    }
                    break;

                case "-d": //производит логическое удаление всех людей с заданными id

                    for (int i = 1; i < args.length; i++) {
                        id = Integer.valueOf(args[i]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setBirthDay(null);
                        allPeople.get(id).setSex(null);
                    }
                    break;

                case "-i": //выводит на экран информацию о всех людях с заданными id: name sex bd

                    for (int i = 1; i < args.length; i++) {
                        id = Integer.valueOf(args[i]);
                        db = allPeople.get(id).getBirthDay();

                        if (allPeople.get(id).getSex() == Sex.MALE) {
                            System.out.println(allPeople.get(id).getName() + " " + "м" + " " + dateformat2.format(db));
                        } else {
                            System.out.println(allPeople.get(id).getName() + " " + "ж" + " " + dateformat2.format(db));
                        }
                    }

                    break;
            }
        }
        //start here - начни тут
    }

}
