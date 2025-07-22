package naruto;

public class DSA_ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array is");
        for(int element : arr){
            System.out.print(element +"\t");
        }

        int first = 0;
        int last = 4;
        System.out.println("\nReverse Array is");
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

        for(int element : arr){
            System.out.print(element +"\t");
        }
    }
}