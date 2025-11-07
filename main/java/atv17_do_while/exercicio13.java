package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio13 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int minutos = 0;
        String encerrar = "N";

        do {
            minutos++;
            System.out.println("Misturando... Minuto " + minutos);

            if (minutos >= 10) {
                System.out.print("Deseja encerrar a mistura? (S/N): ");
                encerrar = sc.nextLine().trim().toUpperCase();
            }

        } while (minutos < 10 || !encerrar.equals("S"));

        System.out.println("Mistura encerrada após " + minutos + " minuto(s).");

        sc.close();

    }
}
