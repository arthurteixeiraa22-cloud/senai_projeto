package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio16 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        char resultado;
        int amostra = 1;

        while (amostra <= 10) {
            do {
                System.out.print("Resultado da amostra " + amostra + " (A/R): ");
                String entrada = scanner.nextLine().trim().toUpperCase();

                if (entrada.length() == 1 && (entrada.charAt(0) == 'A' || entrada.charAt(0) == 'R')) {
                    resultado = entrada.charAt(0);
                    break;
                } else {
                    System.out.println("Entrada inválida! Digite 'A' para aprovado ou 'R' para reprovado.");
                }
            } while (true);

            amostra++;
        }

        System.out.println("Leitura concluída para as 10 amostras.");

        scanner.close();
    }
}
