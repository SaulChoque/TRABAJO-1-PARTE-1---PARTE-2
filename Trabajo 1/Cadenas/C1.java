package Cadenas;
import java.util.Scanner;
public class C1 {
    public static void main(String[] args) {
        String a;
        System.out.println("ingrese cadena: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        StringBuilder b = new StringBuilder(a);
        a = b.reverse().toString();
        System.out.println(a);
    }
}
