package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio18 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.print("Informe o takt (tempo máximo permitido): ");
        double takt = sc.nextDouble();

        double soma = 0;
        int quantidade = 0;
        double media = Double.MAX_VALUE;

        do {
            System.out.print("Informe o tempo da estação: ");
            double tempo = sc.nextDouble();

            soma += tempo;
            quantidade++;
            media = soma / quantidade;

            System.out.printf("Média atual: %.2f%n", media);

        } while (media > takt);

        System.out.println("Média final: " + media);
        System.out.println("Quantidade de estações: " + quantidade);

        sc.close();
    }
}
