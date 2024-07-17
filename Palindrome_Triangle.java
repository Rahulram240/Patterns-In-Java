import java.util.Scanner;
public class Palindrome_Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.err.print("  ");
            }
            for(int k=0;k<2*i+1;k++){
                System.err.print(Math.abs(k-i)+1+" ");
            }
            System.err.println();
        }
    }
}
