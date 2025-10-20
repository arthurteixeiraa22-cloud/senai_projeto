package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //OEE significa Eficiência Global do Equipamento.
        //É um indicador usado na indústria para medir a produtividade de uma máquina ou linha de produção.
        double totalCiclos = 0;
        double totalParadas = 0;
        String continuar;

        do {
            double ciclos;
            double paradas;

            do {
                System.out.print("Informe os ciclos de produção ( > 0): ");
                ciclos = sc.nextDouble();
                if (ciclos <= 0) {
                    System.out.println(" Valor inválido. Ciclos devem ser maiores que zero.");
                }
            } while (ciclos <= 0);

            do {
                System.out.print("Informe o número de paradas (>= 0):");
                paradas = sc.nextDouble();
                if (paradas < 0) {
                    System.out.println("Valor inválido. Paradas não podem ser negativas.");
                }
            } while (paradas < 0);

            totalCiclos += ciclos;
            totalParadas += paradas;

            sc.nextLine();
            System.out.print("Deseja continuar? (S para sim, qualquer outra tecla para sair): ");
            continuar = sc.nextLine().trim().toUpperCase();

            System.out.println();

        } while (continuar.equals("S"));

        double disponibilidade = totalCiclos / (totalCiclos + totalParadas);

        System.out.println("===== RELATÓRIO FINAL =====");
        System.out.println("Total de ciclos: " + totalCiclos);
        System.out.println("Total de paradas: " + totalParadas);
        System.out.println("Taxa de disponibilidade: "+ disponibilidade * 100);

        sc.close();

    }
}
