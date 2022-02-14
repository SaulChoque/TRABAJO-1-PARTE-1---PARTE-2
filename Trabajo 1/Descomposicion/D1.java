package Descomposicion;
import java.util.Scanner;
public class D1 {
    public static void main(String[] args) {
        String a;
        System.out.println("ingrese numero: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        StringBuilder b = new StringBuilder(a);
        a = b.reverse().toString();
        System.out.println(a);
    }
    
}
