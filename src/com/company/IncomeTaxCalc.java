package com.company;

import java.util.Scanner;


public class IncomeTaxCalc {

    public static void main(String [] args){
        final double TAX_RATE = 4.0;
        final double STANDARD_DEDUCTION = 10000.0;
        final double DEPENDENT_DEDUCTION = 2000.0;


        Scanner reader = new Scanner(System.in);

        double grossIncome;
        int numDependents;
        double taxableincome;
        double incomeTax;

        System.out.print("Enter your gross income: ");
        grossIncome = reader.nextDouble();
        System.out.print("Enter the number of Dependents: ");
        numDependents = reader.nextInt();

        taxableincome = grossIncome - STANDARD_DEDUCTION - DEPENDENT_DEDUCTION * numDependents;

        incomeTax = taxableincome * TAX_RATE;

        System.out.println("The income tax is $" + incomeTax);


    }
}
