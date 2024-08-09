import java.util.Scanner;
import java.util.*;
public class Hollow_Pyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int sp=0;sp<i;sp++){
        //         System.err.print("  ");
        //     }
        //     for(int j=n*2-2*i-1;j>0;j--){
        //         System.err.print("* ");
        //     }
        //     System.err.println();
        // }
        System.err.println("\n");
        for(int i=0;i<n;i++){  
            for(int j=n*2-2;j>=0;j--){
                if(i>=1 && i<n){
                    if(j+i==n*2-2||j==i){
                        System.err.print("0 ");
                    }
                    else{
                        System.err.print("  ");
                    }
                }
                else{
                    System.err.print("* ");
                }
            }
            System.err.println();
        }
    }
}
