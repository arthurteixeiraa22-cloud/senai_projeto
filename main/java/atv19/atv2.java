package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a quantidade de numeros desejados ");
        int n = sc.nextInt();
        System.out.println("numeros:");
        int[] soma = new int[n];
        for (int i = 0; i < n; i++) {
            soma[i] += sc.nextInt();
        }
        int cal = 0;
        for (int i = 0; i < n; i++) {
            cal += soma[i];
        }
        int s = cal;
        System.out.println("soma das despesas " + s);
        sc.close();
    }
}

