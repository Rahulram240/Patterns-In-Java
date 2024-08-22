import java.util.Scanner;
public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(j<n-i-1){
                System.err.print("  ");
               }
               else{
                System.err.printf("%4d",x);
               }
            }
            x++;
            System.err.println();
        }
    }
}
