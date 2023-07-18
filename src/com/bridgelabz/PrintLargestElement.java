package com.bridgelabz;
//Java Program to print the largest element in an array
public class PrintLargestElement {
    public static void main(String[] args) {
        //initialize and declare array
        int arr[] = {20, 0, 31, 45, 100, 1, 105, 90};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }

        }
        System.out.println("Largest Number = "+max);
    }

}
