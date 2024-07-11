package com.perscholas.java_basics;

import java.util.Arrays;

//Find the missing number from an array
public class FindNumber {
    public static int findMissingInt(int[] arr) {
        // Complete the method as described.

        Arrays.sort(arr);

        int n = arr[arr.length-1];
        int sum = 0;
        int expectedSum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate the expected sum
        if (arr[0]==1){
            expectedSum = (n * (n + 1)) / 2;
        }else{
            for (int j=arr[0]; j<=n; j++){
                expectedSum += j;
            }
        }

        // Return the missing number
        return expectedSum - sum;
    }

    public static int[] consecutiveInsert(int[] arr, int missingNum) {
        // Complete the method as described.
        int new_arr[] = new int[arr.length + 1];

        // Copying elements from one array to another
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }

        // Adding new element
        new_arr[new_arr.length - 1] = missingNum;

        // Sorting new array
        Arrays.sort(new_arr);

        return new_arr;
    }

    // Checks whether the array is sorted in ascending or descending order.
    private static boolean isAscending(int[] arr) {
        boolean ascending = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                ascending = false;
            }else ascending = true;
        }
        return ascending;
    }

    public static void main(String[] args) {
        int[] sampleArr = {6,8,9};
        System.out.println(findMissingInt((sampleArr)));
        int missingNumber=findMissingInt((sampleArr));
        System.out.println(Arrays.toString(consecutiveInsert(sampleArr, missingNumber)));
        System.out.println(isAscending(sampleArr));
    }
}
