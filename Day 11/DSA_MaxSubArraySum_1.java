package naruto;

// Brute Force O(n^3)
public class DSA_MaxSubArraySum_1 {
    public static void subArrays(int[] arr){
        System.out.println("\nSub Arrays are");
        int totalSubArrays = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            for( int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<j+1; k++) {
                    sum = sum+arr[k];
                    if(max<sum){
                        max = sum;
                    }
                }
                System.out.print("[" +sum+ "] ");
                totalSubArrays++;
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays are " +totalSubArrays+ " and Maximum Sub-Array Sum is " +max);
    }

    public static void main(String[] args) {
        int[] arr = {2, -4, 6, 8, 10, -12, 14, -16, 18, 20};
        for (int j : arr) {
            System.out.print(j +"  ");
        }
        subArrays(arr);
    }
}