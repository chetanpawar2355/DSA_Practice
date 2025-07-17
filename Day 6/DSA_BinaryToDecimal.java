package naruto;

public class DSA_BinaryToDecimal {

    public static void binaryToDecimal(int binaryNumber){
        int myBinary = binaryNumber;
        int decimal = 0;
        int power = 0;
        while (binaryNumber>0){
            int lastNumber = binaryNumber%10;
            decimal = decimal + (lastNumber * (int)Math.pow(2, power));
            power++;
            binaryNumber = binaryNumber/10;
        }
        System.out.println("Binary of " +myBinary+ " is " +decimal);
    }

    public static void main(String[] args) {
        binaryToDecimal(512);
    }
}
