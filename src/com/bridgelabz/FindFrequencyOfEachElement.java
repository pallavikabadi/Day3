package com.bridgelabz;

import java.util.Arrays;

//Java Program to find the frequency of each element in the array
public class FindFrequencyOfEachElement {
    public static void main(String[] args) {
        //Declare And Initialize Array
        int array[] = {2, 5, 9, 12, 45, 76, 32, 1, 12, 8, 9};
        //count Variable for storing frequency count
        int count = 1;
        Arrays.sort(array);//method for sorting array
        for (int i = 0; i < array.length-1; i++) {
                if (array[i] == array[i+1])
                    count=count+1;
                else
                System.out.println(array[i]+" = "+count);
        }
    }
}
