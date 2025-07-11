package naruto;

import java.util.Scanner;

public class DSA_Pattern_Adv_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 4th Pattern
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for(int b=1; b<=n-i; b++){
                System.out.print(" ");
            }
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // 5th Pattern
        System.out.print("Enter the Number of Rows: ");
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int b=1; b<=n-i; b++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>0; i--){
            for(int b=1; b<=n-i; b++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
