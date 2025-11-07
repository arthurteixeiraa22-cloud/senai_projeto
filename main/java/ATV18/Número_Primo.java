package ATV18;

import java.util.Locale;
import java.util.Scanner;

public class Número_Primo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("====verificar de números primos====");
        System.out.println("digite um número inteiro: ");
        int numero = sc.nextInt();
        boolean primo = ePrimo(numero);
        if (primo) {
            System.out.println(numero + " é um numero primo.");
        } else {
            System.out.println(numero + " não é um numero primo");
        }
        sc.close();
    }

    public static boolean ePrimo(int n) {
        if (n < 2) {
            return false;
        }
        return true;
    }
}
