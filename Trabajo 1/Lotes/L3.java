package Lotes;
import java.util.Scanner;
public class L3 {
    public static void main(String[] args) {
        int ai,a=0,c,b=0,d=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            ai=sc.nextInt();
            c=b*10+ai;
            b=c;
            if(c%3==0){
                System.out.println(c+" si es multiplo de 3");
                break;
            }
        }
    }
    
}
