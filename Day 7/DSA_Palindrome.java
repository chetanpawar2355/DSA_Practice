package naruto;

public class DSA_Palindrome {
    public static void myPalindrome(int number){
        int reverse = 0;
        for(int i=number; i>0; i=i/10){
            reverse = reverse * 10 + (i%10);
        }
        if(reverse == number){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static int sum(int number){
        int summ=0;
        for(int i=number; i>0; i=i/10){
            summ = summ + (i%10);
        }
        return summ;
    }

    public static void main(String[] args) {
        myPalindrome(1201);

        // 18 => 1+8=9; 17 => 1+7=8; result = 9+8=17
        int result = sum(18) + sum(17);
        System.out.println("The Sum is " +result);
    }
}
