package Lotes;
import java.util.Scanner;
public class L1 {
    public static void main(String[] args) {
        int ai,i,n,a=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n9=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            ai=sc.nextInt();
            while(ai>0){
                a=ai%10;
                ai=ai/10;
                if(a==1){
                    n1++;
                } else if(a==3){
                    n3++;
                } else if(a==5){
                    n5++;
                } else if(a==7){
                    n7++;
                } else if(a==9){
                    n9++;
                }
            }
        }
        System.out.println("existen "+n1+" unos");
        System.out.println("existen "+n3+" tres");
        System.out.println("existen "+n5+" cincos");
        System.out.println("existen "+n7+" sietes");
        System.out.println("existen "+n9+" nueves");
    }
}
