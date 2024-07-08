package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class PA30371 {

    //Creates an array of integers. Assign the values 1, 2, and 3.
    //and Print out each array element.
    static void task1(){
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
    }

    //Returns the middle element in an array
    static void task2(){
        //create variable middle to store the index
        int middle =0;

        //An integer arr
        int[] arr = {13, 5, 7, 68, 2};

        //To store array length
        int arrlength = arr.length;
        if (arrlength % 2 != 0) {
            middle = arrlength / 2;
            System.out.println(arr[middle]);
        }else{
            middle = (arrlength / 2)-1;
            System.out.println(arr[middle]);
            middle = arrlength / 2;
            System.out.println(arr[middle]);
        }
    }

    //creates an array of String Print out the array length.
    // Make a copy using the clone() method. Use the Arrays.toString()
    static void task3(){
        String[] sourceArray={"red", "green", "blue", "yellow"};
        String[] targetArray = sourceArray.clone();
        System.out.println(sourceArray.length);
        System.out.println("This is the source array: "+Arrays.toString(sourceArray));
        System.out.println("This is the target array: "+Arrays.toString(targetArray));
    }

    //creates an integer array with 5 elements
    //Print out the value at the first index and the last index
    static void task4(){
        int[] intArray = {43,67,3,9,12};
        System.out.println(intArray[0]);
        System.out.println(intArray[intArray.length-1]);

        //Now try printing the value at index = length
        System.out.println(intArray[intArray.length]);

    }

    static void task5(){
        int[] intArr = new int[5];
        for (int i=0;i<intArr.length;i++){
            intArr[i] = i;
        }
        System.out.println(Arrays.toString(intArr));
    }

    static void task6(){
        int[] intArr = new int[5];
        for (int i=0;i<intArr.length;i++){
            intArr[i] = i*2;
        }
        System.out.println(Arrays.toString(intArr));
    }

    static void task7(){
        int[] intArr;
        intArr = new int[] {4, 2, 9, 13, 1};
        int middle=0;

        int arrlength = intArr.length;
        if (arrlength % 2 != 0) {
            middle = arrlength / 2;
            for (int i=0; i<intArr.length;i++){
                if (middle != i)
                    System.out.println(intArr[i]);
            }
        }else{
            System.out.println("No middle element for even arrays");
        }
    }

    static void task8(){
        String[] sourceArray={"red", "green", "blue", "yellow", "black"};
        System.out.println(Arrays.toString(sourceArray));
        int arrlength = sourceArray.length;
        int middle = arrlength / 2;
        String middleEl = sourceArray[middle];
        String firstEl  = sourceArray[0];

        sourceArray[0] = middleEl;
        sourceArray[middle] = firstEl;
        System.out.println(Arrays.toString(sourceArray));
    }

    static void task9(){
        int[] arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }

    //Create an array that includes an integer, 3 strings, and 1 double. Print the array
    static void task10(){
        Object[] arr = {42, "Hello", "World", "Java", 3.14};
        System.out.println(Arrays.toString(arr));
    }

    //create a String array of favorite things based on the
    //answer of the user
    static void task11(){
        //asks the user how many favorite things they have.
        System.out.print("How many favorite things do you have? ");
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        String[] favoriteThings = new String[n];

        for (int i =0; i < favoriteThings.length;i++){
            System.out.printf("Enter your number %d favorite thing: ",i+1);
            Scanner input2 = new Scanner(System.in);
            favoriteThings[i] = input2.nextLine();
        }
        System.out.println("Your favorites things to do: "+Arrays.toString(favoriteThings));
    }

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
        task11();
    }
}
