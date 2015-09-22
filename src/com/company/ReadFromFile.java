package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ReadFromFile {
    public static void main(String[] args) throws IOException{
            Scanner input1 = new Scanner(new File("/Users/student/Desktop/numbers.txt"));
            Scanner input2 = new Scanner(new File("/Users/student/Desktop/numbers.txt"));
            while (input1.hasNext())
            {
                int number = input1.nextInt();
                System.out.println(number);
            }
                System.out.print("\n");
            while (input2.hasNext())
            {
                int number1 = input2.nextInt();
                int number2 = input2.nextInt();
            if (number2 > number1)
                System.out.println(number2);
            else
                System.out.println(number1);
            }
        }
    }
