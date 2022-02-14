package Sumatoria;
import java.util.Scanner;
public class SM3 {
    public static void main(String[] args) {
        int i,a=0,b=1,fn=0,n,s=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            fn=a+b; a=b; b=fn;
            System.out.print(a+" + ");
            s=s+a;
        }
    }
}
