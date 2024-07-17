import java.util.Scanner;
public class Pascal_Program {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=0;
        System.err.println("\n\nSmall Brat Triangle which is a right angle too\n\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
          if(j<n-i){
            System.err.print("  ");
          }
          else{
           if(((i+j)-1)%2==0){
            System.err.print("* ");
           }
           else{
            System.err.print("- ");
           }
          }
            }
            System.err.println();
        }
        System.err.println("\n\n----Here comes the larger one nigga part 1----\n\n");
        for(int i=-n;i<=n;i++){
            if(i<0){
                l=-i;
            }
            else{
                l=i;
            }
            for(int sp=0;sp<l;sp++){
                System.out.print("  ");
            }
            for(int j=0;j<n-l+1;j+=2){
                if(j%2==0){
                    System.err.print("*   ");
                }
                else{
                    System.err.print("- ");//There are possibilities that you might forgot how this program works so Ive replaced the empty spaces with '-' Character  
                }
            }//And for clear example refer the lil' one above the Second One
            System.err.println();
        }
        System.err.println("\n\n----Here comes the larger one nigga part 2----\n\n");
        for(int i=-n;i<=n;i++){
            if(i<0){
                l=-i;
            }
            else{
                l=i;
            }
            for(int sp=0;sp<l;sp++){
                System.out.print("  ");
            }
            for(int j=0;j<n-l+1;j+=2){
                // if(j%2==0){
                    System.err.print("*   ");
                // }
                // else{
                //     System.err.print("- ");//This one is more optimized one 
                // }
            }//And for clear example refer the lil' one above the Second One
            System.err.println();
        }
    }
}
