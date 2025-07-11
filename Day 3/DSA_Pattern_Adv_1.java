package naruto;

import java.util.Scanner;

public class DSA_Pattern_Adv_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st Pattern
        System.out.println("Enter the number of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int b=1; b<=2*(n-i); b++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for(int b=1; b<=2*i-2; b++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
