package naruto;

public class DSA_SubArrays {
    public static void subArrays(int[] arr){
        System.out.println("\nSub Arrays are");
        for (int i=0; i<arr.length; i++) {
            for( int j=i; j<arr.length; j++){
                for(int k=i; k<j+1; k++) {
                    System.out.print("[" +arr[k]+ "] ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int j : arr) {
            System.out.print(j +"\t");
        }
        subArrays(arr);
    }
}
