package naruto;
import java.util.Scanner;

public class DSA_Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5rd Pattern Triangle
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int b=1; b<=n-i; b++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 6th Pattern Number Triangle
        System.out.print("Enter the Number of Rows: ");
        int m = sc.nextInt();
        for(int k=1; k<=m; k++){
            for(int l=1; l<=k; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}