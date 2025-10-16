package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random rand = new Random();

        System.out.println("aperter ENTER para começar");
        sc.nextLine();
        boolean defeito;
        double soma, porcentagem;
        soma = 0;
        for (int peca = 0; peca < 200; peca++) {
            System.out.println("peça: " + peca + " foi verificado com sucesso");
            defeito = rand.nextBoolean();
            if (defeito) {
                soma++;
            }

            porcentagem = (soma * 100) / 200;
            System.out.println("A quantidadde de defeitos: " + porcentagem + "%");
        }
        sc.close();
    }
}
