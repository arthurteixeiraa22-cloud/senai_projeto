package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] encontra = new int[10];
        System.out.println("selecione um numero dentro 1 a 10");
        int num1 = sc.nextInt();
        boolean verifica = false;
        for (int i = 0; i < 10; i++) {
            if (num1 == encontra[i]) {
                verifica = true;
                break;
            }
        }
        if (verifica == true) {
            System.out.println("numero encontrado");
        } else {
            System.out.println("numero não encontrado");
            sc.close();
        }
    }
}
