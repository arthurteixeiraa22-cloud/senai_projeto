package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o numeros desejados ");
        int num = sc.nextInt();
        int[] separacao = new int[num];
        int maior = 0, menor = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("digite o " + i + " numero: ");
            separacao[i] = sc.nextInt();

            if (separacao[i] == 0) {
                maior = separacao[i];
                menor = separacao[i];
            } else {
                if (separacao[i] > maior) {
                    maior = separacao[i];
                }
                if (separacao[i] < menor) {
                    menor = separacao[i];
                }
            }
        }
        System.out.println("numero maior: " + maior + "\nnumero menor: " + menor);
    }
}
