package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double consumo;
        double soma = 0;
        int turnos = 0;

        System.out.println("Digite o consumo (kWh) por turno.");
        System.out.println("Digite 0 para encerrar.");

        do {
            System.out.print("Consumo do turno (kWh): ");
            consumo = sc.nextDouble();

            if (consumo > 0) {
                soma += consumo;
                turnos++;
            } else if (consumo < 0) {
                System.out.println("Valor inválido. Digite um número positivo ou 0 para encerrar.");
            }

        } while (consumo != 0);

        System.out.println("===== RELATÓRIO FINAL =====");
        System.out.println("Total de consumo: " + soma + " kWh");

        if (turnos > 0) {
            double media = soma / turnos;
            System.out.printf("Média por turno: "+media);
        } else {
            System.out.println("Nenhum turno registrado.");
        }

        sc.close();
    }
}
