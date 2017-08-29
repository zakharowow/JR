package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    public String cat = null;


    public void initialize(String name) {
        this.cat = name;
}

    public void initialize(String name, int veight, int age) {
        this.cat = name + veight + age;
    }

    public void initialize(String name, int age) {
        int veight = 12;
        this.cat = name + age + veight;
    }

    public void initialize(String color, int veight, String name, String address, int age) {
        name = null;
        address = null;
        age = 0;
        this.cat = color + veight + name + address + age;
    }

    public void initialize(int veight, String colour, String address) {
        this.cat = veight + colour + address;
    }//напишите тут ваш код

}
