package com.bridgelabz;
//Java Program to print the elements of an array
public class PrintElementOfArray {
    public static void main(String[] args) {
        //1st Way To Create and Initialise Array
        int array[]={2,3,12,5,8,7,56,9,3};

        //2nd Way To Create and Initialise Array
        int array1[]=new int[5];
        array1[0]=2;
        array1[1]=4;
        array1[2]=78;
        array1[3]=55;

        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");

        }
        System.out.println();
        for(int i=0;i<array1.length;i++) {
            System.out.print(array1[i]+" ");
        }
        //Iterate Using ForEach Loo[
        System.out.println();

        for(int i:array){
            System.out.print(i +" ");
        }
    }
}
