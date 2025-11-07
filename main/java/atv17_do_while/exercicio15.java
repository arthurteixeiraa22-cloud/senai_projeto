package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio15 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        double valor;

        do {
            System.out.print("Informe o valor calibrado (mA): ");
            valor = scanner.nextDouble();

            if (valor < 4.0 || valor > 20.0) {
                System.out.println("Valor fora da faixa [4.0 - 20.0]. Tente novamente.");
            }
        } while (valor < 4.0 || valor > 20.0);

        System.out.println("Calibração OK");

        scanner.close();
    }
}
