package naruto;

import java.util.Scanner;

public class DSA_Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st Pattern Solid Rectangle
        System.out.print("1. Enter the Number: ");
        int n = sc.nextInt();
        for(int i=0; i<n-1;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Pattern Hollow Rectangle
        System.out.println("2. Enter the Number: ");
        int m = sc.nextInt();
        for(int k=1;k<=m;k++){
            for(int l=1; l<=m;l++){
                if(k==1 || l==1 || k==m || l==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
