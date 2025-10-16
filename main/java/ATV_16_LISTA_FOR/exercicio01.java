package ATV_16_LISTA_FOR;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double media, eficiencia,soma=0;
        for (double i=0; i<=100; i++ ){
            System.out.println("digite a eficiencia da maquina "+i+":");
            eficiencia=sc.nextDouble();
            soma += eficiencia;
            System.out.println(media=soma/100);
            System.out.println("media de eficiencia das maquinas: "+media+ "%");
        }
            sc.close();
    }
}
