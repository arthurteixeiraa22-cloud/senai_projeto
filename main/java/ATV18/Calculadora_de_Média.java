package ATV18;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora_de_Média {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("====calculadora de média====");
        System.out.println("digite o número de notas: ");
        int quantidade = sc.nextInt();
        double[] notas = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("digite a nota " + (i + 1) + ":");
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida! insira uma nota entre 0 e 10.");
                i++;
            } else {
                notas[i] = nota;
            }
        }
        double media = calcularMedia(notas);
        System.out.println("A media do aluno é: " + media);

        sc.close();
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length;i++) {
            soma+=notas[i];
        }
        return soma/notas.length;
    }
}
