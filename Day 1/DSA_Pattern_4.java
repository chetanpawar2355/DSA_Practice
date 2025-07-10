package naruto;

import java.util.Scanner;

public class DSA_Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 7th Pattern Number Triangle
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=1; j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        // 8th Pattern Number Triangle
        System.out.print("Enter the Number of Rows: ");
        int m = sc.nextInt();
        int num = 1;
        for(int k=1;k<=m; k++){
            for(int l=1; l<=k; l++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }

        // 9th Pattern 0 & 1 Triangle
        System.out.print("Enter the Number of rows: ");
        int x = sc.nextInt();
        for(int p=1; p<=x; p++){
            for(int q=1; q<=p; q++){
                int sum = p+q;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}