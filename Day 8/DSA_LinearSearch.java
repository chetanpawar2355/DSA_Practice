package naruto;

import java.util.Scanner;

public class DSA_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int flag = 0;
        int position = 0;

        for(int i=0; i< arr.length; i++){
            System.out.print("Element Number " +(i+1)+ " is ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Number which we won't to find: ");
        int find = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(find==arr[i]){
                flag = 1;
                position = i+1;
                break;
            }
        }

        if(flag==1){
            System.out.println("The Position of " +find+ " is " +position);
        }
        else {
            System.out.println("Element Not Found...");
        }
    }
}
