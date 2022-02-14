package Descomposicion;
import java.util.Scanner;
public class D2 {
    public static void main(String[] args) {
        String a;
        System.out.println("ingrese numero:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        a = a.replaceAll("2", "");
        a = a.replaceAll("3", "");
        a = a.replaceAll("5", "");
        a = a.replaceAll("7", "");
        System.out.println(a);
    }
}
