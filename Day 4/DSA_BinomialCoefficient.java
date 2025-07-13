package naruto;

import java.util.Scanner;

public class DSA_BinomialCoefficient {
    public static int fac(int c){
        int fact = 1;
        for(int i=c; i>0;i--){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the Value of r: ");
        int r = sc.nextInt();
        int result = (fac(n))/(fac(r)*fac(n-r));
        System.out.println("The Binomial Coefficient of " +n+ " is " +result);
    }
}
