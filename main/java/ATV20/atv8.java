package ATV20;

import java.util.Locale;
import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("coloque a quantidade de temperaturas que deseja saber");
        int n = sc.nextInt();
        int[] temperatura = new int[n];
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("digite a temperatura" + (i + 1) + ":");
            temperatura[i] = sc.nextInt();
            if (temperatura[i] >= 35) {
                System.out.println("alerta");
            } else {
                System.out.println("temperatura normal");
            }
        }
        sc.close();
    }
}
