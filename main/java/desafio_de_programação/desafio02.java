package desafio_de_programação;

import java.util.Locale;
import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite os numeros inteiros para transforma-lo em romano(1 a 399)");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 399) {
            System.out.println("numero fora do limite");
        } else {
            System.out.println("numero romano ");
            while (numero >= 100) {
                System.out.println("C");
                numero -= 100;
            }
            if (numero >= 90) {

                System.out.println("XC");

                numero -= 90;

            }
        }

    }
}