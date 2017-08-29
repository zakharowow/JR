package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    FileOutputStream adapter;

    AdapterFileOutputStream(FileOutputStream adapter) {
        this.adapter = adapter;
    }

    public void flush() throws IOException {adapter.flush();
    }

    public void writeString(String s) throws IOException {adapter.write(s.getBytes());
    }

    public void close() throws IOException {adapter.close();
    }

}

