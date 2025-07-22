package naruto;

import java.util.Scanner;

public class DSA_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Array: ");
        int number = sc.nextInt();
        int[] arr = new int[number];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the Number " +(i+1)+ " is ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Sorted Array Elements are \n");
        for (int element : arr){
            System.out.print(element +"\t");
        }

        System.out.print("\nEnter the Number which we won't to find: ");
        int keyValue = sc.nextInt();

        int mid;
        int position = 0;
        int flag = 0;

        int i=0, j=number-1;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid]==keyValue){
                flag = 1;
                position = i+1;
                break;
            }
            if(arr[mid]<keyValue){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }

        if(flag==1){
            System.out.println("Element Found at Position " +position);
        }
        else {
            System.out.println("Element not found...");
        }
    }
}
