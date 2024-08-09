import java.util.Scanner;
public class Up_Arrow {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();;
        for(int i=0;i<=n;i++){
            for(int j=-n;j<=n;j++){
                if(-i<j && j<i){
                    System.err.print("  ");
                }
                else{
                    System.err.print("* ");
                }
            }
            System.err.println();
        }
    }
}
