package desafio_de_programação;

import java.util.Locale;
import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor que deseja sacar: R$ ");
        int valor = sc.nextInt();
        if (valor % 2 != 0) {
            System.out.println("valor inválido! o valor deve ser múltiplo de 2.");
        } else {
            int ced50 = 0, ced10 = 0, ced2 = 0;
            int resto = valor;

            if (resto >= 50) {
                ced50 = resto / 50;
                resto = resto % 50;
            }
            if (resto >= 10) {
                ced10 = resto / 10;
                resto = resto % 10;
            }
            if (resto >= 2) {
                ced2 = resto / 2;
                resto = resto % 2;
            }
            System.out.println("Distribuição das cedulas: ");
            System.out.println("R$50: " + ced50 + "cedula(s)");
            System.out.println("R$10: " + ced10 + "cedula(s)");
            System.out.println("R$2: " + ced2 + "cedula(s)");
        }
        sc.close();
    }
}
