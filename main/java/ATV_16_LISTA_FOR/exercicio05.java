package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random rand = new Random();
        System.out.println("digite ENTER para começar o programa");
        sc.nextLine();
        double media, soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("maquina " + i + " verificada");
            for (int hora = 1; hora <= 24; hora++) {
                int consumo = rand.nextInt(301);
                System.out.println("Em " + hora + " a máquina" + i + " teve a media de consumo de " + consumo + " kWh");
                soma += consumo;
                media = soma / 50;
                System.out.println("a media de consumo das maquinas e: " + media);
                sc.close();
            }
        }
    }
}

