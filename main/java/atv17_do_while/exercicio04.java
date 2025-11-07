package atv17_do_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //A sigla MES Trata-se de um sistema de software
        //usado para monitorar, controlar e documentar
        //o processo de produção de bens, desde a matéria-prima
        //até o produto final.

        int opcao;
        do {
            //aqui vai ser onde exibe o menu

            System.out.println("===menu===");
            System.out.println("1 para registrar parada.");
            System.out.println("2 para registrar produção.");
            System.out.println("3 para sair.");
            opcao = sc.nextInt();

            //opçoes
            switch (opcao) {
                case 1:
                    System.out.println("parada registrada com sucesso. ");
                    break;
                case 2:
                    System.out.println("produção registrada com sucesso.");
                    break;
                case 3:
                    System.out.println("saindo do programa.");
                    break;
                default:
                    System.out.println("opção invalida.Tente novmente. ");
            }
            System.out.println();
        } while (opcao != 3);

        sc.close();
    }
}
