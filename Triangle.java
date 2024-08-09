import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(); 
        System.err.print("enter the letter = ");
        char c=s.next().charAt(0);
        for(int i=0;i<n;i++){
            for(int sp=0;sp<n-i;sp++){
                System.err.print("  ");
            }
            for(int j=0;j<2*i+1;j++){
               if(j==0||j==2*i||i==n-1||j==i){
                System.err.print(c+" ");
               }
               else{
                System.err.print("  ");
               }
            }
            c++;
            System.err.println();
            
        }
    }
}
