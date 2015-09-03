package com.company;
import java.util.Scanner;
/**
 * Created by student on 9/1/15.
 */
public class Payroll {
    public static void main(String[]args){
        double wage; // This is the regular wage.
        double regHours; // This is the amount of hours worked.
        double overHours;  // This is the amount of overtime hours worked.
        double total; //This is the total weekly wage.
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter your normal wage: ");
        wage = reader.nextDouble();
        System.out.print("Please enter the number of hours worked: ");
        regHours = reader.nextDouble();
        System.out.print("Please enter the number of overtime hours worked: ");
        overHours = reader.nextDouble();
        total = ((overHours * (wage * 1.5)) + (wage * regHours));
        System.out.print("Your total weekly wage is: $"+ total);
    }
}
