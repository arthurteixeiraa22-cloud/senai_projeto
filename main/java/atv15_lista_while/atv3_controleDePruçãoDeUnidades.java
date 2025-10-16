package atv15_lista_while;

import java.util.Locale;
import java.util.Scanner;

public class atv3_controleDePruçãoDeUnidades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int horas=0;
        int producaoTotal=0;

        System.out.println("digite a produção");
        int producaoPorHora= sc.nextInt();

        System.out.println("digite quantas horas a maquina vai trabalhar: ");
        int totalDeHoras= sc.nextInt();

        while (horas< totalDeHoras){
            producaoTotal +=producaoPorHora;
            horas++;
            System.out.println("hora "+horas+": produção total = "+ producaoTotal+"unidades");
        }
        sc.close();
    }
}
