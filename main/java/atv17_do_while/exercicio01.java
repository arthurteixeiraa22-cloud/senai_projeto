package atv17_DO_WHILE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int temperatura;
        do {
            System.out.println("digite a temperatura do forno industrial");
            temperatura = sc.nextInt();
        } while (temperatura < 800 || temperatura > 1200);
        System.out.println("a temperatura valida: " + temperatura);
        sc.close();
    }
}
