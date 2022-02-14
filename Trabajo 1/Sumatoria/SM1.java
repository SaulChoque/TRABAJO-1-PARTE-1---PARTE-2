package Sumatoria;
import java.util.Scanner;
public class SM1 {
    public static void main(String[] args) {
        int i,d,n,sp=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        d=n*2;
        for(i=0;i<=d;i++){
            if(i%2==0){
                sp=sp+i;
            }
        }
        System.out.println(sp);
    }
    
}
