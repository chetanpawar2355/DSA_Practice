package naruto;

import java.util.Scanner;

public class DSA_Pattern_Adv_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2nd Pattern
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int b=1; b<=n-i; b++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 3rd Pattern
        System.out.print("Enter the Number of Rows: ");
        int m = sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int b=1; b<=n-i; b++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
