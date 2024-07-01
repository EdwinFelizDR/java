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

    //function that prints out grades A, B, C, D, F, according to:
    //A: 90-100 | B: 80-89 | C: 70-79 | D: 60-69 | F: <60

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

    //function that accepts an integer between 1 and 7 from the user
    //and print out the corresponding weekday
    static void printWeekday(){
        Scanner weekDay = new Scanner(System.in);
        System.out.print("Day number of the week: ");
        int intNumber = weekDay.nextByte();

        switch (intNumber){
            case 1: System.out.printf("Day of week (%d): Monday",intNumber); break;
            case 2: System.out.printf("Day of week (%d): Tuesday",intNumber); break;
            case 3: System.out.printf("Day of week (%d): Wednesday",intNumber); break;
            case 4: System.out.printf("Day of week (%d): Thursday",intNumber); break;
            case 5: System.out.printf("Day of week (%d): Friday",intNumber); break;
            case 6: System.out.printf("Day of week (%d): Saturday",intNumber); break;
            case 7: System.out.printf("Day of week (%d): Sunday",intNumber); break;
            default: System.out.println("Out of range, number should be: 1-7");
        }
    }

    //Function for Display how much tax the user would have to pay according to status and income

    static void taxToPay(){
        Scanner maritalStatus = new Scanner(System.in);
        Scanner income = new Scanner(System.in);

        System.out.println("Choose your marital status: ");
        System.out.println("1. Single, 2. Married Filing Jointly");
        System.out.println("3. Married Filing Separately, and 4. Head of Household");
        System.out.print("What is your marital Status (1-4): ");
        int status = maritalStatus.nextInt();
        if (status >0 & status < 5){
            System.out.print("How much is your income: ");
            int incomeAmount = income.nextInt();
            double tax=0;

            double taxRate = 0;
            byte category =0;

            //Assign category for Single status
            if (status == 1 & (incomeAmount> 0 & incomeAmount <= 8350)) category = 1;
            else if ( status == 1 & (incomeAmount> 8350 & incomeAmount <= 33950)) category = 2;
            else if (status == 1 & (incomeAmount> 33950 & incomeAmount <= 82250)) category =3;
            else if (status == 1 & (incomeAmount> 82250 & incomeAmount <= 171550)) category =4;
            else if (status == 1 & (incomeAmount> 171550 & incomeAmount <= 372950)) category =5;
            else if (status == 1 & (incomeAmount > 372950)) category =6;

            //Assign category for Married Filing Jointly
            else if (status == 2 & (incomeAmount> 0 & incomeAmount <= 16700)) category = 7;
            else if (status == 2 & (incomeAmount> 16700 & incomeAmount <= 67900)) category =8;
            else if (status == 2 & (incomeAmount> 67900 & incomeAmount <= 137050)) category =9;
            else if (status == 2 & (incomeAmount> 137050 & incomeAmount <= 208850)) category =10;
            else if (status == 2 & (incomeAmount> 208850 & incomeAmount <= 372950)) category =11;
            else if (status == 2 & (incomeAmount > 372950)) category =12;

            //Assign category for Married Filing Separately
            else if (status == 3 & (incomeAmount> 0 & incomeAmount <= 8350)) category = 13;
            else if (status == 3 & (incomeAmount> 8350 & incomeAmount <= 33950)) category =14;
            else if (status == 3 & (incomeAmount> 33950 & incomeAmount <= 68525)) category =15;
            else if (status == 3 & (incomeAmount> 68525 & incomeAmount <= 104425)) category =16;
            else if (status == 3 & (incomeAmount> 104425 & incomeAmount <= 186475)) category =17;
            else if (status == 3 & (incomeAmount > 186475)) category =18;

            //Assign category for Head of Household
            else if (status == 4 & (incomeAmount> 0 & incomeAmount <= 11950)) category = 19;
            else if (status == 4 & (incomeAmount> 11950 & incomeAmount <= 45500)) category =20;
            else if (status == 4 & (incomeAmount> 45500 & incomeAmount <= 117450)) category =21;
            else if (status == 4 & (incomeAmount> 117450 & incomeAmount <= 190200)) category =22;
            else if (status == 4 & (incomeAmount> 190200 & incomeAmount <= 372950)) category =23;
            else if (status == 4 & (incomeAmount > 372950)) category =24;


            switch (category){
                //Calculate tax to pay for single status
                case 1: taxRate = 0.10; tax = incomeAmount * taxRate; break;
                case 2: taxRate = 0.15; tax = incomeAmount * taxRate; break;
                case 3: taxRate = 0.25; tax = incomeAmount * taxRate; break;
                case 4: taxRate = 0.28; tax = incomeAmount * taxRate; break;
                case 5: taxRate = 0.33; tax = incomeAmount * taxRate; break;
                case 6: taxRate = 0.35; tax = incomeAmount * taxRate; break;

                //Calculate tax to pay for Married Filing Jointly
                case 7: taxRate = 0.10; tax = incomeAmount * taxRate; break;
                case 8: taxRate = 0.15; tax = incomeAmount * taxRate; break;
                case 9: taxRate = 0.25; tax = incomeAmount * taxRate; break;
                case 10: taxRate = 0.28; tax = incomeAmount * taxRate; break;
                case 11: taxRate = 0.33; tax = incomeAmount * taxRate; break;
                case 12: taxRate = 0.35; tax = incomeAmount * taxRate; break;

                //Calculate tax to pay for Married Filing Separately
                case 13: taxRate = 0.10; tax = incomeAmount * taxRate; break;
                case 14: taxRate = 0.15; tax = incomeAmount * taxRate; break;
                case 15: taxRate = 0.25; tax = incomeAmount * taxRate; break;
                case 16: taxRate = 0.28; tax = incomeAmount * taxRate; break;
                case 17: taxRate = 0.33; tax = incomeAmount * taxRate; break;
                case 18: taxRate = 0.35; tax = incomeAmount * taxRate; break;

                //Calculate tax to pay for Head of Household
                case 19: taxRate = 0.10; tax = incomeAmount * taxRate; break;
                case 20: taxRate = 0.15; tax = incomeAmount * taxRate; break;
                case 21: taxRate = 0.25; tax = incomeAmount * taxRate; break;
                case 22: taxRate = 0.28; tax = incomeAmount * taxRate; break;
                case 23: taxRate = 0.33; tax = incomeAmount * taxRate; break;
                case 24: taxRate = 0.35; tax = incomeAmount * taxRate; break;
            }
            System.out.printf("according to status and income the user would have to pay: $%,.2f",tax);
        }else {
            System.out.println("Please enter a valid value (1-4)");
        }
    }

    public static void main(String[] args) {
        //task1(15);
        //task1(50);
        //printOutGrades();
        //printWeekday();
        taxToPay();
    }
}
