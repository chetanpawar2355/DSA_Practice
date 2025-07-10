package naruto;

import java.util.Scanner;

public class DSA_Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3rd Pattern Triangle
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 4th Pattern Triangle
        System.out.print("Enter the Number of Rows: ");
        int m = sc.nextInt();
        for(int k=1; k<=m; k++){
            for(int l=m-k+1; l>0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
