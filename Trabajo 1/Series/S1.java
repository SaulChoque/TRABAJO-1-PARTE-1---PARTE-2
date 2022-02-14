package Series;
import java.util.Scanner;
public class S1 {
    public static void main(String[] args) {
        int i,n,a=1,b=1,c=1,d;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("1, ");
        for(i=0;i<n-1;i++){
            d=a+b+c;
            a=b;b=c;c=d;
            System.out.print(a+", ");
        }
    }
}
