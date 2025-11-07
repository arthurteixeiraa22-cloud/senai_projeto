package ATV20;

import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("insira a quantidae de preços");
        int n = sc.nextInt();

        double[] preco = new double[n];
        for (int i = 0; i < preco.length; i++) {
            System.out.println("preço " + (i + 1) + " :");
            preco[i] = sc.nextDouble();
        }
        double soma = 0.0;
        System.out.println("preços digitados");
        for (double p : preco) {
            System.out.println(p);
            soma += p;
        }
        double media = soma / preco.length;
        System.out.println("media= " + media);
        sc.close();
    }
}
