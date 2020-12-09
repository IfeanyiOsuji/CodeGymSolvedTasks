package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory implements  ImageReader {
    //public  static ImageReader imageReader;

    public static ImageReader getImageReader(ImageTypes imageTypes){

            if(imageTypes==null)
                throw new IllegalArgumentException("Unknown image type");

        if (imageTypes.equals(ImageTypes.JPG))
                return new JpgReader();
            else if (imageTypes.equals(ImageTypes.PNG))
                return new PngReader();
             else if (imageTypes.equals(ImageTypes.BMP))
                return new BmpReader();
             else
                 return null;

        }



    }

