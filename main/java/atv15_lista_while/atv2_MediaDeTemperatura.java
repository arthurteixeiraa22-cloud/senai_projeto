package atv15_lista_while;

import java.util.Locale;
import java.util.Scanner;

public class atv2_MediaDeTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

          int leitura=0;
          double soma=0;

          while (leitura<24){

              System.out.println("digite a temperatura da hora "+(leitura + 1)+":");

              double temperatura= sc.nextDouble();

              soma=soma+ temperatura;
              leitura++;
          }
          double media=soma/24;
        System.out.println("temperaatura em 24 horas foi: "+ media+"°C");
        sc.close();


    }
}
