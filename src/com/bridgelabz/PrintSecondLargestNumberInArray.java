package com.bridgelabz;
// Find 2nd Largest Number in an Array
public class PrintSecondLargestNumberInArray {
    public static void main(String[] args) {
        //initialize and declare array
        int arr[] = {20, 0, 31, 45, 100, 1, 105, 90};
        int max=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                secondLargest=max;
                max=arr[i];
            }
            if(arr[i] < max && arr[i] > secondLargest){
                secondLargest=arr[i];
            }

        }
        System.out.println("Largest = "+max);
        System.out.println("secondLargest = "+secondLargest);
    }
}
