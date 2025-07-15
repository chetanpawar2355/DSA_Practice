import java.util.Scanner;

public class PrimeNumber {

    // Non Optimised Code
    public static boolean isPrime(int number){
        for(int i=2; i<=number-1; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    // Optimised Code
    public static boolean optimisePrime(int number){
        if(number == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    // Primes In Range
    public static void primesInRange(int number){
        for(int i=2; i<=number; i++){
            if(optimisePrime(i)){
                System.out.print(i+ "\t");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print(num+ " is " +isPrime(num));
        System.out.print("\nEnter the Number for Optimised Prime Number Code: ");
        int op = sc.nextInt();
        System.out.print(op+ " is " +optimisePrime(op));
        System.out.print("\nEnter the Number for Primes In range: ");
        int ranges = sc.nextInt();
        primesInRange(ranges);
    }
}
