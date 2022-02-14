package Series;
import java.util.Scanner;
public class S2 {
    public static void main(String[] args) {
        int i,n,s=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            System.out.print(s+", ");
            s=s*2;
        }
    }
}
