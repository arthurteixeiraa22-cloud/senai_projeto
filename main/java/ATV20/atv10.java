package ATV20;

import java.util.Locale;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de jogadores que deseja saber a pontuação");
        int n = sc.nextInt();
        int[] pontuacao = new int[n];
        int pontuacao100 = 0, pontuacao50 = 0;
        for (int i : pontuacao) {
            System.out.println("digite a " + (i + 1) + " pontuaçoes");
            pontuacao[i] = sc.nextInt();
            if (pontuacao[i] >= 100) {
                pontuacao100++;
            } else {
                pontuacao50++;
            }
        }
        System.out.println("====resultados====");
        System.out.println();
        System.out.println("\njogadores destaques " + pontuacao100 + "\nprecição treinar " + pontuacao50);
    }
}

