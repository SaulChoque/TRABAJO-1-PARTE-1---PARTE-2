package Series;
import java.util.Scanner;
public class S3 {
    public static void main(String[] args) {
        int i,n,s=0,c=1,d=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n-1;i++){
            if(i%2==0){
                c=c+s;
                System.out.print(c+", ");
            }else{
                s=s+c;
                System.out.print(s+", ");
            }
        }
    }
    
}
