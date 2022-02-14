package Descomposicion;
import java.util.Scanner;
public class D3 {
    public static void main(String[] args) {
        String a;
        System.out.println("ingrese numero:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        a = a.replaceAll("2", "");
        a = a.replaceAll("4", "");
        a = a.replaceAll("6", "");
        a = a.replaceAll("8", "");
        System.out.println(a);
    }
    
}
