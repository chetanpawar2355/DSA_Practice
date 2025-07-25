package naruto;

//Kadane's Algorithm
public class DSA_MaxSubArraySum_3 {
    public static void kadanesAlgorithm(int[] arr){
        int totalSubArraySum = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            if(sum>0){
                max = sum;
            }
            else{
                sum = 0;
            }
            totalSubArraySum++;
        }
        System.out.println("\n" +max+ " and " +totalSubArraySum);
    }

    public static void main(String[] args) {
        int[] arr = {2, -4, 6, 8, 10, -12, 14, -16, 18, 20};
        for (int j : arr) {
            System.out.print(j +"  ");
        }
        kadanesAlgorithm(arr);
    }
}
