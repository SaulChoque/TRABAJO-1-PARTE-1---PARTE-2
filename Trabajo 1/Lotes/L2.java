package Lotes;
import java.util.Scanner;
public class L2 {
    public static void main(String[] args) {
        int ai,i,n,a=0,b=0,c=0,d=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
        ai=sc.nextInt();
        if(ai>1){
        System.out.println("el numero ingresado no es correcto");

        }else if(ai<0){
        System.out.println("el numero ingresado no es correcto");

        }else if(ai==1){

        if(d==0){
        a++;
        c=1;
        }else{
        a=0;
        a++;
        d=0;
        }
        }else{
        if(c==0){
        b++;
        d=1;
        }else{
        b=0;
        b++;
        c=0;
        }
        }
        }
        System.out.println("Tamaño de la secuencia mas grande de 1 es:"+a);

        System.out.println("Tamaño de la secuencia mas grande de 0 es:"+b);
    }
}
