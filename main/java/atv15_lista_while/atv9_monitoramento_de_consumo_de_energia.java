package atv15_lista_while;

import java.util.Locale;
import java.util.Scanner;

public class atv9_monitoramento_de_consumo_de_energia {public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double consumo = 1000;
    int hora = 1;
    double total = 0;

    while (hora <= 5) {
        System.out.println("hora " + hora + String.format("%.2f", consumo) + " watts");
        total += consumo;
        consumo *= 1.10;
        hora++;
    }
    System.out.println("Consumo total após 5 horas: " + String.format("%.2f", consumo) + " whatts");
    sc.close();
    }
}

