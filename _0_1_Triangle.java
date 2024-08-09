import java.util.Scanner;
public class _0_1_Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.err.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if((i+j)%2==0){
                    System.err.print(1+" ");
                }
                else{
                    System.err.print(0+" ");
                }
            }
            System.err.println();
        }
    }
}
