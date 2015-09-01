package com.company;
import java.util.Scanner;

/**
 * Created by Sean Doran on 8/28/15.
 * This Program round numbers.
 */
public class Round {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double input; //Input number


        System.out.print("Enter the number to be rounded: ");
        input = reader.nextDouble();
        int output = (int) (input + 0.5);


        System.out.print(output);

    }

}
