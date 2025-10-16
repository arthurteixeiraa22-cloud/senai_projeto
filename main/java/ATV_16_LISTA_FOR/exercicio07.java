package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("aperte ENTER para começar o programa");
        sc.nextLine();
        double media;
        int soma=0;
        for (int i = 1; i <= 50; i++) {
            int minutos = rand.nextInt(61);
            System.out.println("Soldagem "+i+" concluída . Tempo gasto: "+minutos+" minutos");
            soma+=minutos;
            media = soma / 60;
            System.out.println("O tempo médio de cada soldagem foi de: "+media);
        }
        sc.close();
    }
}
