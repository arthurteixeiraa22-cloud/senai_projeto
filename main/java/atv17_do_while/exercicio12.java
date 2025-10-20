package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        //WMS Trata-se de um software usado para otimizar e automatizar operações logísticas em armazéns e centros de distribuição,
        // abrangendo desde o recebimento e armazenamento de produtos até a separação e expedição.
        int numeroPalete;
        int contagem = 0;

        System.out.println("Digite o número do palete. Digite -1 para encerrar.");

        do {
            System.out.print("Número do palete: ");
            numeroPalete = sc.nextInt();

            if (numeroPalete != -1) {
                contagem++;
            }

        } while (numeroPalete != -1);

        System.out.println("Contagem final de paletes: " + contagem);

        sc.close();
    }
}
