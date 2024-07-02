package com.perscholas.java_basics;
import java.util.Scanner;

//PA - 303.5.1 - Practice Assignment - Loops
public class PA30351Loops {

    //Print a Multiplication Table
    static void multTable() {
        //nested for loops to print a multiplication table
        int x = 0, y = 0;


        // Print the header row
        System.out.print("    ");
        for (x = 1; x <= 12; x++) {
            System.out.printf("%4d", x);
        }

        System.out.println("\n   -------------------------------------------------");

        // Print the multiplication table
        for (x = 1; x <= 12; x++) {
            System.out.printf("%2d |", x);
            for (y = 1; y <= 12; y++) {
                System.out.printf("%4d", x * y);
            }
            System.out.println();
        }
    }

    //2: Find the Greatest Common Divisor
    // Write a program that prompts the user to enter two positive integers,
    // and find their greatest common divisor (GCD).
    static void greatestCommonDivisor(){
        int n1 = 0, n2 = 0, mod=0;

        //Ask user for a positive number
        System.out.print("enter a positive integer: ");
        Scanner input1 = new Scanner(System.in);
        n1 = input1.nextInt();

        //Ask user for a positive number
        System.out.print("enter another positive integer: ");
        Scanner input2 = new Scanner(System.in);
        n2 = input2.nextInt();

        //get the larger and the smallest number and stored
        int larger = Math.max(n1, n2);
        int smallest = Math.min(n1, n2);

        int GCD = 0;

        //iterate backwards over the larger number
        for (int i = larger; i > 0; i--){
            n1 = larger % i;
            //check if the remainder of the larger number over i is 0
            if (n1 == 0) {
                n2 = smallest % i;

                //check if the remainder of the smallest number over i is 0
                if (n2 == 0){
                    GCD = i;
                    System.out.println("greatest common divisor: "+GCD);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        //multTable();
        greatestCommonDivisor();
    }
}
