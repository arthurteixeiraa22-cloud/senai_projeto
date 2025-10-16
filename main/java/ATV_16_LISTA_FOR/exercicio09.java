package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random rand = new Random();
        System.out.println("aperte ENTER para começar");
        sc.nextLine();
        int soma = 0, previsao;
        double media;
        for (int i = 0; i <= 31; i++) {
            previsao = rand.nextInt(1001);
            System.out.println("previsao de demanda para o dia: " + i + " fora feitas " + previsao + " unidades");
            soma += previsao;
            media = soma / 31;
            System.out.println("A media de unidades produzidas foram de: " + media);
            sc.close();
        }
    }
}
