package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println(" aperte ENTER para começar");
        Random gerador=new Random();

        double soma= 0;

        for (int hora=0; hora<=12;hora++){
            System.out.println("A hora atual e: "+ hora);
            System.out.println("A media da temperatura e: "+ soma/60);

            for (int i=0; i<=60; i++){
                int temperatura=gerador.nextInt(201);
                System.out.println(" no minuto "+ i+" a temperatura foi: "+temperatura);
                soma+=temperatura;
                sc.close();
            }
        }
    }
}
