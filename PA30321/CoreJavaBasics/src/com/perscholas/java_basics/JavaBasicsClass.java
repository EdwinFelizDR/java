package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {
        //1. Write a program that declares two integer variables,
        //   assigns an integer to each, and adds them together.
        //   Assign the sum to a variable. Print out the result.
        //   declaring var1, var2, and res
        int var1=10, var2=25, resInt=0;
        resInt = var1 + var2;
        System.out.println("Sum of var1 and var 2 is: "+resInt);

        //2. Write a program that declares two double variables,
        //   assigns a number to each, and adds them together. Assign the sum to a variable.
        //   Print out the result.
        double varDouble1=4.5, varDouble2=5.7, sumDouble=0;
        sumDouble = varDouble1 + varDouble2;
        System.out.println("Sum of varDouble1 and varDouble2 is: "+sumDouble);

        //3. Write a program that declares an integer variable and a double variable,
        //	 assigns numbers to each, and adds them together. Assign the sum to a variable.
        //	 Print out the result.
        //   What variable type must the sum be? should be double.
        int intVar = 10;
        double doubleVar=5.7, resD=0;
        resD = intVar + doubleVar;
        System.out.println("The Sum of intVar and doubleVar is: "+resD);

        //4. Write a program that declares two integer variables,
        //   assigns an integer to each, and divides the larger number by the smaller number.
        //   Assign the result to a variable. Print out the result.
        //   Now change the larger number to a decimal. What happens? What corrections are needed?
        //   If you change one of the numbers to decimal is going to throw an error. Type mismatch.
        //   To work with decimals all variables should be changed to float or double
        int num1 = 2, num2 = 15;

        // Divide the larger number by the smaller number
        int result = num1 > num2 ? num1 / num2 : num2 / num1;
        System.out.println("Result of integer division: " + result);

        //5. Write a program that declares two double variables, assigns a number to each,
        //   and divides the larger by the smaller number. Assign the result to a variable.
        //   Print out the result. Now, cast the result to an integer. Print out the result again.

        // Declare and assign values to two double variables
        double number1 = 10.5;
        double number2 = 5.2;

        // Find the larger and smaller numbers
        double larger = Math.max(number1, number2);
        double smaller = Math.min(number1, number2);

        // Divide the larger by the smaller number
        double result5 = larger / smaller;

        // Print out the result
        System.out.println("Result before casting to integer: " + result5);

        // Cast the result to an integer
        int castedResult = (int) result5;

        // Print out the casted result
        System.out.println("Result after casting to integer: " + castedResult);

        //6. Write a program that declares two integer variables, x and y,
        //   and assigns the number 5 to x and the number 6 to y.
        //   Declare a variable q and assign y/x to it and print q.
        //   Now, cast y to a double and assign it to q. Print q again.

        // Declare and assign values to two integer variables
        int x = 5;
        int y = 6;

        // Declare a double variable to store the division result
        double q;

        // Perform integer division of y by x and assign it to q
        q = (double) y / x; // Casting y to double before division

        // Print q after integer division
        System.out.println("After integer division: q = " + q);

        // Cast y to double and assign it to q
        q = (double) y;

        // Print q after casting y to double
        System.out.println("After casting y to double: q = " + q);

        //7. Write a program that declares a named constant
        //   and uses it in a calculation. Print the result.
        final double pi =3.14, aNumber=10;
        double sumPi = pi + aNumber;
        System.out.println(sumPi);

        //8. Write a program where you create three variables that represent products at a cafe.

        //Create 3 variables that represents products at a cafe
        double coffee=1.51, cappuccino=2.20, green_tea=3.35;

        //Create 2 variables called subtotal and totalSale
        double subtotal=0, totalSale=0;

        subtotal = (coffee*3) + (cappuccino*4) + (green_tea*2);
        final double SALES_TAX = 0.08;
        totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.printf("Total sale amount is: %,.2f",totalSale);
    }
    }

