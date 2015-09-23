package com.company;
import java.util.Scanner;
/**
 * Created by student on 9/21/15.
 */
public class MatrixCords {
    public static void main (String []args ){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int  row = reader.nextInt();
        System.out.print("Enter the number of columns: ");
       int col = reader.nextInt();
        System.out.println("The matrix coordinates in normal order: ");
        for (  int y = 0; y < row; y++){
            for (int x = 0; x < col; x++)
                System.out.print("(" + x + ", " + y + ") ");
                    System.out.println();
        }
        System.out.print("\n");

        System.out.println("The matrix coordinates in reverse order: ");
        for (  int y = row - 1; y >=0; y--){
            for (int x = col - 1; x >= 0; x--)
                System.out.print("(" + x + ", " + y + ") ");
            System.out.println();



        }
    }
}
