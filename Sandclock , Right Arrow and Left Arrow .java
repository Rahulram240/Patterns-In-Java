import java.util.Scanner;
public class Sandclock {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.err.println("***********SANDCLOCK************");
        int l=0;
        for(int i=-n;i<=n;i++){
            if(i<0){
                l=-i;
            }
            else{
                l=i;
            }
           for(int sp=0;sp<n-l;sp++){
            System.err.print(" ");
           }
           for(int j=0;j<l+1;j++){
            System.err.print("* ");
           }
           System.err.println();
        }
        System.err.println();
        System.err.println("***********************LEFT ARROW*******************\n");
        for(int i=-n;i<=n;i++){
            if(i<0){
                l=-i;
            }
            else{
                l=i;
            }
           for(int sp=0;sp<n-l;sp++){
            System.err.print("");
           }
           for(int j=0;j<l+1;j++){
            System.err.print("* ");
           }
           System.err.println();
        }
        System.err.println("***********************RIGHT ARROW*******************\n");
        for(int i=-n;i<=n;i++){
            if(i<0){
                l=-i;
            }
            else{
                l=i;
            }
           for(int sp=0;sp<n-l;sp++){
            System.err.print("  ");
           }
           for(int j=0;j<l+1;j++){
            System.err.print("* ");
           }
           System.err.println();
        }
    }
}
