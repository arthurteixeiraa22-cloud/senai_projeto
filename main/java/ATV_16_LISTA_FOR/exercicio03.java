package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("aperte ENTER para começar o programa");
        sc.nextLine();
        double soma =0;
        double media;
        for (int dia=1;dia<31;dia++){
            int prod= random.nextInt(500);
            System.out.println("o dia atual e: "+ dia+" sua produção foi de: "+prod);
            System.out.println();
            soma+=prod;
        }
        System.out.println();
        System.out.println("o total da produção de: "+ soma);
        media=soma/31;
        System.out.println();
        System.out.println("a media é: " +media);
            }
        }


