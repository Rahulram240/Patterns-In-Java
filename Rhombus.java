import java.util.Scanner;
public class Rhombus {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=0;i<n;i++){
        for(int sp=0;sp<i;sp++){
            System.err.print(" ");
        }
        for(int j=0;j<n-1;j++){
            System.err.print("* ");
        }
        System.err.println();
    }
   } 
}
