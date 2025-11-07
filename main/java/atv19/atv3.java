package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos numeros deseja");
        int n = sc.nextInt();

        int positivos = 0, negativos = 0;
        int[] separacao = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("digite o " + i + " numero:");
            separacao[i] = sc.nextInt();

            if (separacao[i] > 0) {

                positivos++;
            } else {

                negativos++;
            }
        }
        System.out.println("total de positivos: " + positivos + "\nTotal de negativos: " + negativos);
    }
}
