package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        //AGV Refere-se a robôs autônomos que transportam materiais em ambientes como armazéns e fábricas,
        // seguindo rotas pré-definidas por sistemas como fitas magnéticas,
        // laser ou GPS, sem a necessidade de um motorista humano.

        int totalCaixas = 0;
        int viagens = 0;
        int caixasEntregues;

        System.out.println("=== Controle de entregas do AGV ===");
        System.out.println("Objetivo: Entregar pelo menos 50 caixas.");

        do {
            System.out.print("Caixas entregues na viagem " + (viagens + 1) + ": ");
            caixasEntregues = sc.nextInt();

            if (caixasEntregues > 0) {
                totalCaixas += caixasEntregues;
                viagens++;
            } else {
                System.out.println("Valor inválido. Informe uma quantidade positiva.");
            }

        } while (totalCaixas < 50);

        System.out.println("Total de caixas entregues: " + totalCaixas);
        System.out.println("Número de viagens realizadas: " + viagens);

        sc.close();
    }
}
