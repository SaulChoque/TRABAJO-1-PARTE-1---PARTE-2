package Cadenas;
import java.util.Scanner;
public class C2 {
    public static void main(String[] args) {
        String a,c,e;
        System.out.println("ingrese cadena: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextLine();
        StringBuilder b = new StringBuilder(a);
        c = b.reverse().toString();
        System.out.println(a+" = "+c);
        if(a.equals(c)){
            System.out.println("si es palindromo");
        }else{
            System.out.println("no es palindromo");
        }
    }
}
