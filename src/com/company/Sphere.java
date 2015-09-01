package com.company;
import java.util.Scanner;

/**
 * Created by student on 9/1/15.
 */
public class Sphere {
    public static void main(String[]args){
     double radius;   // input the radius
     double C;  // output circumference C = 2pir
     double D; // output diameter d = 2r;
     double A;   // output Surface Area A = 4pir^2
     double V;   // output volume V = 4/3pir^3
     Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the Radius: ");
        radius = reader.nextDouble();

        C = 2 * Math.PI * radius;
        int g = (int) C;

        D = 2 * radius;
        int x = (int) D;

        A = (4 * Math.PI * (radius * radius));
        int i = (int) A;

        V = (( 4 / 3) * Math.PI * (radius * radius * radius));



        System.out.print("Here are the outputs:");
        System.out.println("The Circumference is: " + g + "");
        System.out.println("The Diameter is: " + x);
        System.out.println("The Surface Area is: " + i);
        System.out.println("The Volume is: " + V);


    }
}
