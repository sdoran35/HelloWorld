package com.company;
import java.util.Scanner;
/**
 * Sean Doran
 * Oct 6 2015
 */
public class BandDriver {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        Band band0 = new Band();  // Calls constructor
        System.out.print("What is Band name? ");
        band0.setName(reader.nextLine());
        System.out.print("How many members? ");
        band0.setMembers(reader.nextInt());
        System.out.print("Good band? ");
        band0.setGood(reader.nextBoolean());
        System.out.println(band0);
    }
}
