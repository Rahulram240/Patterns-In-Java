import java.util.Scanner;
public class Hollow_Square {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.print("Enter the Number=");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1 ){
                    System.err.print("* ");
                }
                else{
                    System.err.print("  ");
                }
            }
            System.err.println();
        }
    }
}
