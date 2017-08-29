package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Чеширский on 30.04.2016.
 */
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes imagetype){
            if (imagetype == ImageTypes.BMP) {
                return new BmpReader();
            }
            if (imagetype == ImageTypes.JPG) {
                return new JpgReader();
            }
            if (imagetype == ImageTypes.PNG) {
                return new PngReader();
            }
            else throw new IllegalArgumentException ("Неизвестный тип картинки");

    }
}
