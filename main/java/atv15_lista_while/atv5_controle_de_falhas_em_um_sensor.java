package atv15_lista_while;

import java.util.Locale;
import java.util.Scanner;

public class atv5_controle_de_falhas_em_um_sensor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int comeco=0;
        int limite =0;

        while (comeco<120){
            comeco=comeco+limite;
            comeco++;
            System.out.println("preçao aumentanddo: "+comeco);
        }
        System.out.println("limite de preção atingido");
    }
}
