package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio14 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int d01 = 0;
        int d02 = 0;
        int d03 = 0;
        String entrada;

        System.out.println("Digite os códigos de defeito (D01, D02, D03). Digite FIM para encerrar.");

        do {
            System.out.print("Código: ");
            entrada = sc.nextLine().trim().toUpperCase();

            switch (entrada) {
                case "D01":
                    d01++;
                    break;
                case "D02":
                    d02++;
                    break;
                case "D03":
                    d03++;
                    break;
                case "FIM":
                    break;
                default:
                    System.out.println("Código inválido. Use D01, D02, D03 ou FIM.");
            }

        } while (!entrada.equals("FIM"));

        System.out.println("===== RELATÓRIO DE DEFEITOS =====");
        System.out.println("D01 - Ocorrências: " + d01);
        System.out.println("D02 - Ocorrências: " + d02);
        System.out.println("D03 - Ocorrências: " + d03);

        sc.close();
    }
}
