package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio09 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        boolean resultado = false;
        int tentativas = 0;

        System.out.println("Digite o resultado do teste da peça (true = aprovado, false = reprovado)");

        do {
            System.out.print("Resultado do teste (true/false): ");
            resultado = sc.nextBoolean();
            tentativas++;

            if (!resultado) {
                System.out.println("Peça reprovada. Enviando para reprocesso...\n");
            }

        } while (!resultado);

        System.out.println("Peça aprovada após " + tentativas + " tentativa(s).");

        sc.close();
    }
}
