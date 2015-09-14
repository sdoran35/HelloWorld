package com.company;
/**
 * Created by Sean Doran on 9/10/15.
 */
public class Digits {
    public static void main(String[] args) throws InterruptedException {
            int odd = -1;
            int even = 22;

            while (odd < 19) {
                odd += 2;
                Thread.sleep(100);
                System.out.print(odd);
                Thread.sleep(100);
                System.out.print("  ");
                Thread.sleep(100);
                System.out.print(odd * odd);
                Thread.sleep(100);
                System.out.print("  ");
                Thread.sleep(100);
                System.out.println(odd * odd * odd);
                Thread.sleep(100);
                System.out.println("  ");
                Thread.sleep(100);

            }
            System.out.println("\n");
            while (even > 2){
                even = even - 2;

                Thread.sleep(600);
                System.out.print(even);

            }
            }
        }




