package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            if (users.size() > 0) {
                for (User x : users) {
                    String data = x.getFirstName();
                    if (data == null) data = "noName";
                    writer.println(data);
                    data = x.getLastName();
                    if (data == null) data = "noLastName";
                    writer.println(data);
                    //возможный косяк
                    writer.println(x.getBirthDate().getTime());

                    writer.println(String.valueOf(x.isMale()));
                    writer.println(x.getCountry());

                }
            }
            writer.flush();
            writer.close();

            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                User user = new User();
                String data;
                if ((data = reader.readLine()).equals("noName")) data = null;
                user.setFirstName(data);
                if ((data = reader.readLine()).equals("noLastName")) data = null;
                user.setLastName(data);
                user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                if (reader.readLine().equals("true")) {
                    user.setMale(true);
                } else user.setMale(false);


                user.setCountry(User.Country.valueOf(reader.readLine()));
                users.add(user);
            }
        }
    }
    //implement this method - реализуйте этот метод
}


