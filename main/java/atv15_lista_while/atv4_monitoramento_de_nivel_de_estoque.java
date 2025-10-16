package atv15_lista_while;

import java.util.Locale;
import java.util.Scanner;

public class atv4_monitoramento_de_nivel_de_estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int estoque= 500;
        int reducao=20;
        int limite=90;

        System.out.println("monitoramento do estoque");

        while (estoque > limite) {
            System.out.println("estoque atual: "+estoque+"unidades");

            estoque-=reducao;
        }


    }
}
