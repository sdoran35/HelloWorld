package com.company;

import images.APImage;
import images.Pixel;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by student on 9/22/15.
 */
public class FlippedImage {
    public static void main(String[] args) {
        // open up a keyboard scanner
        Scanner reader = new Scanner(System.in);
        APImage theOriginal = new APImage("/Users/student/OneDrive/AP Comp Sci/Media Computing/Smokey.jpg");
        theOriginal.draw();
        int width = theOriginal.getWidth();
        int height = theOriginal.getHeight();
        APImage theClone = new APImage(width, height);
        int x, y;
        int newX, newY;

        for (x = 0; x < width; x++) {
            for (y = 0; y < height; y++) {
                Pixel pixel = theOriginal.getPixel(x, y);
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                newX = width - x - 1;
                newY = height - y - 1;
                Pixel pixel1 = theClone.getPixel(newX, newY);
                pixel1.setRed(red);
                pixel1.setGreen(green);
                pixel1.setBlue(blue);
            }
        }
        System.out.print("Press Enter to Flip Image.");
        reader.nextLine();
        theClone.draw();
    }

}



