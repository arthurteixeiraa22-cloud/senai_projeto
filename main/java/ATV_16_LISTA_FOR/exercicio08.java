package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("aperte ENTER para começar ");
        sc.nextLine();
        int soma = 0;
        int ano = 360 * 24;
        for (int i = 1; i <= 360; i++) {
            int u = rand.nextInt(600);
            System.out.println("dai: " + i + " com " + u + "horas de operação");
            soma += u;
            int total = soma * ano;
            System.out.println("o total de horas de operação foi de: " + total);
        }
        sc.close();
    }
}
