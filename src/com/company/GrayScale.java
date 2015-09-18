package com.company;

import images.APImage;
import images.Pixel;

import java.util.Scanner;

/**
 * Created by student on 9/18/15.
 */
public class GrayScale {
    public static void main(String[] args) {
        // open up a keyboard scanner
        Scanner reader = new Scanner(System.in);
        // read in the file image
        APImage image = new APImage("/Users/student/OneDrive/AP Comp Sci/Media Computing/Smokey.jpg");
        // display the original image
        image.draw();

        for(Pixel p : image)
        {
            int red = p.getRed();
            int green = p.getGreen();
            int blue = p.getBlue();
            int average = ( red + green + blue) / 3;

            p.setBlue(average);
            p.setGreen(average);
            p.setRed(average);
        }

        System.out.print("Press Enter to Continue");
        reader.nextLine();
        image.draw();
    }

}
