import java.util.Scanner;
public class Printing_the_no_series_diagonally{
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.err.print("Enter the no = ");
    int a=s.nextInt();
    for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){
        if(i==j || i+j==a-1){
            System.err.print(j+1+" ");
        }
        else{
            System.err.print("  ");
        }
        }
        System.err.println();
    }
}
}
