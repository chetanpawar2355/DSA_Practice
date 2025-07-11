package naruto;

import java.util.Scanner;

public class DSA_Pattern_1Ad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if (i%2!=0){
                for(int j=1; j<=n; j++){
                    int t = i*n-n+j;
                    if(t==1 || t==2 || t==3 || t==4 || t==5 || t==6 || t==7 || t==8 || t==9)
                    {
                        System.out.print("0" +t+ " ");
                    }
                    else {
                        System.out.print(t +" ");
                    }
                }
            }
            else {
                for(int j=1; j<=n; j++){
                    int y = i*n-j+1;
                    if(y==1 || y==2 || y==3 || y==4 || y==5 || y==6 || y==7 || y==8 || y==9)
                    {
                        System.out.print("0" +y+ " ");
                    }
                    else {
                        System.out.print(y+ " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
