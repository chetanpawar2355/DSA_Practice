package naruto;

import java.util.Scanner;

public class DSA_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            System.out.print("Enter the Number " +(i+1)+ " is ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray Elements are");
        for (int j : arr) {
            System.out.print(j +"\t");
        }

        int largestNumber = arr[0];
        for(int i=0; i<arr.length; i++){
            if(largestNumber<arr[i]){
                largestNumber = arr[i];
            }
        }
        System.out.print("\nLargest Number is " +largestNumber);
    }
}