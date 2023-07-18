package com.bridgelabz;
//Java Program to print the elements of an array present on odd position
public class PrintNumbersPresentOnOddPosition {
    public static void main(String[] args) {
        //initialize and declare array
        int array[] = {2, 4, 3, 5, 6, 7,8};
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                System.out.println(array[i]+" position="+i);

            }
        }
    }
}
