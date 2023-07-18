package com.bridgelabz;
// Java Program to print the duplicate elements of an array
public class PrintDuplicateElements {
    public static void main(String[] args) {
        //initialize and declare array
        int arr[] = {4, 4, 9, 3, 2, 3};
    //itrerating array using for loop
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate value : " + arr[i]);
                    break;
                }
            }
        }
    }
}
