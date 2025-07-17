package naruto;

public class DSA_DecimalToBinary {

    public static void decimalToBinary(int number){
        int myBinary = number;
        int power = 0;
        int binNum = 0;
        while(number>0){
            int rem = number%2;
            binNum = binNum + (rem * (int)Math.pow(10, power));
            power++;
            number = number/2;
        }
        System.out.println("Binary Form of " +myBinary+ " is " +binNum);
    }
    public static void main(String[] args) {
        decimalToBinary(15);
    }
}
