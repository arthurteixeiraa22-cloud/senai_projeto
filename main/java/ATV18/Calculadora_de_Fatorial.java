package ATV18;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora_de_Fatorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("====calculadora fatorial====");
        System.out.println("digite o numero inteiro");
        int numero = sc.nextInt();
        long resultado = calculadoraFatorial.calculadora(numero);
        System.out.println("o fatorial de " + numero + "é" + resultado + ".");
    }

    class calculadoraFatorial {
        public static long calculadora(int poseidon) {
            long fatorial = 1;
            int i = poseidon;
            while (i > 1) {
                fatorial *= i;
                i--;
            }
            return fatorial;
        }
    }
}