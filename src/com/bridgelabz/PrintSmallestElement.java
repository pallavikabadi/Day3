package com.bridgelabz;
//Java Program to print the smallest element in an array
public class PrintSmallestElement {
    public static void main(String[] args) {
        //initialize and declare array
        int arr[]= {-20, 0, -25, 15, 19, 37, 23};
        int min=arr[0];//initialize empty array to store value
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }System.out.println("Smallest Number = "+min);
    }
}
