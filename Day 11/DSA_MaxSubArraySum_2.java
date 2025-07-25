package naruto;

// Prefix Sum Array
public class DSA_MaxSubArraySum_2 {

    public static void prefixArray(int[] arr){
        int sum;
        int totalSubArray = 0;
        int[] prefix = new int[arr.length];
        int max = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = i; j < arr.length; j++) {
                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum>max){
                    max = sum;
                }
                System.out.print("[" +sum+ "] ");
                totalSubArray++;
            }
        }
        System.out.println("\nTotal Sub-Arrays are " +totalSubArray+ " and " +max);
    }
    public static void main(String[] args) {
        int[] arr = {2, -4, 6, 8, 10, -12, 14, -16, 18, 20};
        for (int element : arr){
            System.out.print(element+ "  ");
        }
        prefixArray(arr);
    }
}
