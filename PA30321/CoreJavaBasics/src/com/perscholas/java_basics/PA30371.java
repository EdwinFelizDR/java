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

    public static void main(String[] args) {
        //task1();
        //task2();
    }
}
