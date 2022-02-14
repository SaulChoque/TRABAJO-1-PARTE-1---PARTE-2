package MatrizT;
import java.util.Scanner;
public class M1 {
    static public int a[][][]=new int[10][10][10];
    static public int p1,p2,p3;
    static public void mostrart(int n,int m,int p){
        int i,j,k;
        System.out.println("");
        for(k=1;k<=p;k++){
            for(i=1;i<=n;i++){
                for(j=1;j<=m;j++){
                    System.out.print("\t"+a[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println(" prof="+k);
        }
    }
    static public void llenart(int n,int m,int p){
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        for(k=1;k<=p;k++){
            for(i=1;i<=n;i++){
                for(j=1;j<=m;j++){
                    System.out.print("a["+i+"]["+j+"]["+k+"]= ");
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
    }
    static public void mayor(int n,int m,int p){
        int i,j,k,may=0;
        for(k=1;k<=p;k++){
            for(i=1;i<=n;i++){
                for(j=1;j<=m;j++){
                    if(a[i][j][k]>may){
                        may=a[i][j][k];
                        p1=i;p2=j;p3=k;
                    }
                }
            }
        }       
    }
    public static void main(String[] args) {
        int n,m,p;
        Scanner sc=new Scanner(System.in);
        System.out.print("introduzca cantidad de columnas => ");
        n=sc.nextInt();
        System.out.print("introduzca cantidad de filas => ");
        m=sc.nextInt();
        System.out.print("introduzca cantidad de matrices => ");
        p=sc.nextInt();
        System.out.println();
        llenart(n, m, p);
        mostrart(n, m, p);
        mayor(n, m, p);
        System.out.println("mayor i= "+p1+" j= "+p2+" k= "+p3);
    }
}
