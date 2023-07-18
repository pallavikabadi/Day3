package com.bridgelabz;
//Java Program to sort the elements of an array in ascending order
public class SortArrayInAscendingOrder {
    public static void main(String[] args) {
        //initialize and declare array
        int arr[]= {6,3,9,4,2,5,7,4};
        int temp;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //Logic for swapping Elements
                if (arr[i] > arr[j] ) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            System.out.print(arr[i] + " ");
        }

    }

}
