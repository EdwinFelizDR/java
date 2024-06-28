package com.perscholas.java_basics;

public class OperatorsAndNumbers {
    static void Task1() {

        //program 1:
        //declares an integer a variable x = 2
        int x = 2 ;
        System.out.println(Integer.toBinaryString(x));

        // 1 bit left shift operation
        x  = x << 1;

        //
        System.out.println(Integer.toBinaryString(x));
        System.out.println(x);

        //Perform the preceding exercise with the following values: a.9, b.17, c.88
        x = 9; System.out.println(Integer.toBinaryString(x)); System.out.println(x);
        x = 17; System.out.println(Integer.toBinaryString(x)); System.out.println(x);
        x = 88; System.out.println(Integer.toBinaryString(x)); System.out.println(x);
    }

    static void Task2(){
        //declares a variable x, and assigns 150 to it
        int x = 150;

        // 2 bit right shift operation
        x  = x << 2;

        //the output will be: binary=1001011000, decimal = 600
        System.out.println(Integer.toBinaryString(x));
        System.out.println(x);

        //Perform the preceding exercise with the following values: a.225, b.b.	1555, c.32456
        x = 225; System.out.println(Integer.toBinaryString(x)); System.out.println(x);
        x = 1555; System.out.println(Integer.toBinaryString(x)); System.out.println(x);
        x = 32456; System.out.println(Integer.toBinaryString(x)); System.out.println(x);
    }

    static void Task3(){
        //declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
        int x=7, y=17, z=0;
        z = x & y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        //Task4
        z = x | y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }

    static void Task5(){
        //declares an integer variable, assigns a number
        int intVar = 9;
        System.out.println(intVar);
        intVar++;
        System.out.println(intVar);
    }

    static void Task6(){
        //Way 1 to increment a variable
        int varToInc = 20;
        varToInc++;
        System.out.println(varToInc);

        //Way 2 to increment a variable
        varToInc = varToInc + 1;
        System.out.println(varToInc);

        //Way 3 to increment a variable
//        varToInc =;
        System.out.println(varToInc);

    }

    static void Task7(){
        //declares two integer variables: x, and y, and then assigns 5 to x and 8 to y
        int x=5, y =8, sum=0;
        sum = ++x + y;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
        //Task5();
        //Task6();
        Task7();
    }
}
