package atv15_lista_while;

import java.util.Locale;
import java.util.Scanner;

public class atv8_contagem_de_falhas_em_sensores_de_qualidade {public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite ENTER para iniciar o programa :");
    sc.nextLine();
    int falhas = 0;
    int peca = 0;

    while (falhas < 50) {
        peca += 200;
        falhas++;
        System.out.println("falhas n° " + falhas + " detectar após " + peca + " peças");
    }
    System.out.println("Toal de falhas:" + falhas);
    sc.close();

    }
}

