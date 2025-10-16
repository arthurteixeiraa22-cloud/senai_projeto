package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("digite a nota minima para a aprovação: ");
        int n1= sc.nextInt();
        System.out.println("quantos testes de qualidade vc quer registrar? ");
        int quantidade= sc.nextInt();
        int aprovados=0;
        for (int i=1;i<=quantidade;i++){
            System.out.println("resultado do teste "+i+": ");
            int resultado= sc.nextInt();
            if (resultado>=n1){
                aprovados++;
                double Ap = ((double) aprovados / quantidade)*100;
                System.out.println("Total de embalagens testadas:"+quantidade);
                System.out.println("Total de embalagens aprovadas:"+aprovados);
                System.out.println("Porcentagem de embalagens aprovadas "+ Ap);
            }
            sc.close();
        }
    }
}
