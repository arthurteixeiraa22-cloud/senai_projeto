package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio19 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double taxaFalhas = 100.0;

        do {
            System.out.print("Informe o número de falhas no ciclo: ");
            int falhas = sc.nextInt();

            System.out.print("Informe o número de peças produzidas no ciclo: ");
            int pecas = sc.nextInt();

            if (pecas <= 0) {
                System.out.println("Número de peças deve ser maior que zero. Tente novamente.");
                continue;
            }

            taxaFalhas = ((double) falhas / pecas) * 100;

            System.out.printf("Taxa de falhas atual: %.2f%%%n%n", taxaFalhas);

        } while (taxaFalhas > 2.0);

        System.out.printf("Taxa final de falhas: %.2f%%%n", taxaFalhas);

        sc.close();
    }
}
