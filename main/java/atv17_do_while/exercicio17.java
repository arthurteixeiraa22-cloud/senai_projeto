package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio17 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        // RMSpode ter diferentes significados dependendo do contexto:
        // Root Mean Square (Raiz Média Quadrada) em engenharia e eletrônica,
        // para medir a potência contínua de equipamentos como caixas de som e estabilizadores;
        // e Registro do Ministério da Saúde para médicos do Programa Mais Médicos no Brasil.
        int consecutivasAbaixo = 0;
        int totalLeituras = 0;
        double leitura;

        do {
            System.out.print("Informe o nível RMS de vibração: ");
            leitura = sc.nextDouble();
            totalLeituras++;

            if (leitura < 2.5) {
                consecutivasAbaixo++;
            } else {
                consecutivasAbaixo = 0; // zera contador se leitura >= 2.5
            }

        } while (consecutivasAbaixo < 3);

        System.out.println("\nTotal de leituras feitas: " + totalLeituras);

        sc.close();
    }
}
