package com.company;
import images.APImage;
import images.Pixel;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by student on 9/18/15.
 */
public class Posterize {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();
        APImage image = new APImage("/Users/student/OneDrive/AP Comp Sci/Media Computing/Smokey.jpg");
        // display the original image
        int red0 = generator.nextInt(256);
        int blue0 = generator.nextInt(256);
        int green0 = generator.nextInt(256);
        int red1 = generator.nextInt(256);
        int blue1 = generator.nextInt(256);
        int green1 = generator.nextInt(256);
        image.draw();
        for (Pixel p : image) {
            int red = p.getRed();
            int green = p.getGreen();
            int blue = p.getBlue();
            int average = (red + green + blue) / 3;
            if (average < 120) {
                // make the pixel black (all color values set to zero)
                p.setRed(red0);
                p.setGreen(green0);
                p.setBlue(blue0);
            }
            // otherwise the average value is light
            else {
                // make the pixel white (all color values set to 255)
                p.setRed(red1);
                p.setGreen(green1);
                p.setBlue(blue1);
            }

        }
        System.out.print("Press Enter to Continue");
        reader.nextLine();
        image.draw();
    }
}

