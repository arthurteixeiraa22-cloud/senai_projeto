package desafio_de_programação;

import java.util.Locale;
import java.util.Scanner;

public class desafio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        System.out.println("Fatores primos de " + n + ":");

        int divisor = 2;

        while (n > 1) {
            int contador = 0;

            while (n % divisor == 0) {
                contador++;
                n = n / divisor;

            }

            if (contador > 0) {
                System.out.println(divisor + "^" + contador);
            }
            divisor++;
        }
        sc.close();
    }
}
