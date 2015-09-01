package com.company;
import java.util.Scanner;
/**
 * Created by Sean Doran on 8/31/15.
 */
public class Cube {
    public static void main(String []args){
        int A; //This is the Surface Area.
        int a; //This is side length
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter the side length: ");
        a = reader.nextInt();
        A = (6 * (a * a));
        System.out.print("The Surface Area of this Cube is " + A + "units^2");
    }
}
