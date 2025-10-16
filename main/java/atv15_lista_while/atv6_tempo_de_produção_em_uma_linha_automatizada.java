package atv15_lista_while;

import java.util.Locale;
import java.util.Scanner;

public class atv6_tempo_de_produção_em_uma_linha_automatizada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        System.out.println("informe o tempo inicial por peça(segundos)");
        int tempo= sc.nextInt();

        System.out.println("informe o numero total de peças");
        int totalPecas= sc.nextInt();

        System.out.println("informe quanto o tempo diminui a cada ciclo(em segundos)");
        int reducao= sc.nextInt();

        int contador=1;
        int tempoTotal=0;

        while (contador<=totalPecas){
            System.out.println("peça "+contador+" produzida em "+ tempo+" segundos");
            tempoTotal+=tempo;

            tempo-=reducao;
            if (tempo<0){
                tempo=0;
            }
            contador++;
        }
        System.out.println("tempo total de produção: "+tempoTotal+"segundos");
  sc.close();
    }
}
