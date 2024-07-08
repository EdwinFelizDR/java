package com.perscholas.java_basics;

import java.util.Arrays;

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
        
    }

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        task7();

    }
}
