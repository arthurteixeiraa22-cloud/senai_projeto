package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int aprovado=0,reprovado=0;
        String entrada;

            System.out.println("digite os resultados da inspeção(a=aprovado,r=reprovado)");
            System.out.println("Digite FIM para encerrar");
        do {
            System.out.println("resultados:");
            entrada= sc.nextLine().trim().toUpperCase();

            if (entrada.equals("A")){
                aprovado++;
            } else if (entrada.equals("R")) {
                reprovado++;
            } else if (!entrada.equals("FIM")) {
                System.out.println("entrada invalida. use apenas 'a' ou 'r' ou 'fim'. ");
            }
        }while (!entrada.equals("FIM"));

        System.out.println("=====RESULTADO FINAL=====");
        System.out.println("total de peças aprovadas "+aprovado);
        System.out.println("total de peças reprovadas "+reprovado);

        sc.close();

    }
}
