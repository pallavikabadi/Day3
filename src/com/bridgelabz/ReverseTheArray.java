package com.bridgelabz;
//Java Program to print the elements of an array in reverse order
public class ReverseTheArray {
    public static void main(String[] args) {
        //initialize and declare array
        int arr[]= {1,2,3,4,5};
		for(int i=arr.length-1;i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }
}
}
