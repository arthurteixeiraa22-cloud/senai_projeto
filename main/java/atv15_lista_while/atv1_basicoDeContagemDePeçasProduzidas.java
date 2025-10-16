package atv15_lista_while;

import java.util.Locale;
import java.util.Scanner;

public class atv1_basicoDeContagemDePeçasProduzidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (x < 100) {
            x++;
            System.out.println("as peça produzidas  " + x);
        }
        sc.close();
    }
}
