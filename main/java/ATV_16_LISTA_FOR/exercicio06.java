package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random rand = new Random();
        System.out.println("aperte ENTER para iniciar o programa");
        sc.nextLine();
        int media, soma = 0;
        for (int i = 1; i <= 50; i++) {
            int materias = rand.nextInt(100);
            System.out.println("O material " + i + " teve um consumo de: " + materias);
            soma += materias;
            media = soma / 50;
            System.out.println("consumo medio dos materiais e de: " + media);

        }
    }
}