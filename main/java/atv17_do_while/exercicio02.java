package atv17_do_while;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //célula CNC é um controle numerico computadorizado
        int peca, soma = 0, ciclo = 0;
        do {
            System.out.println("informe a quantidade de peças produzidas: ");
            peca = sc.nextInt();
            soma += peca;
            ciclo++;

        } while (soma < 120);
        System.out.println("ciclos: " + ciclo + " total: " + soma);
        sc.close();
    }
}
