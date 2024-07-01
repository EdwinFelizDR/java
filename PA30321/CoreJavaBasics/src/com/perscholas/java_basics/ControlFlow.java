package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlow {

    //Task 1: Write a program that...
    static void task1(int x){
        //declares 1 integer variable x and assigns 7 to it
        //if statement to print out “Less than 10” if x is less than 10
        if (x < 10){
            System.out.println("Less than 10");
//        }else if (x > 10){
//            System.out.println("Greater than 10");
        }else if (x > 10 & x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x>=20) {
            System.out.println("Greater than or equal to 20");
        }
    }

    //print out grades A, B, C, D, F, according to:
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //A: 90-100
    //F: <60

    static void printOutGrades(){
        Scanner score = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int x = score.nextInt();
        if (x >=90 & x<=100){
            System.out.println("Your grade is: A");
        } else if (x >=80 & x<=89) {
            System.out.println("Your grade is: B");
        } else if (x >=70 & x<=79) {
            System.out.println("Your grade is: C");
        } else if (x >=60 & x<=69) {
            System.out.println("Your grade is: D");
        } else {
            System.out.println("Your grade is: F");
        }
    }

    static void printWeekday(int intNumber){
        switch (intNumber){
            case 1:
                System.out.printf("Week day according to number (%d)",intNumber);
        }
    }

    public static void main(String[] args) {
        //task1(15);
        //task1(50);
        //printOutGrades();
        printWeekday(1);
    }
}
