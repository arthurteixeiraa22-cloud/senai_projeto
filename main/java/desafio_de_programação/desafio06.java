package desafio_de_programação;

import java.util.Locale;
import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("======= tabuada de 1 a 10 =======");
        System.out.print("    ");

        for (int j=1;j<=10;j++){
            System.out.printf(""+j);

        }
        System.out.println("--------------------------------------------");

        for (int i=1;i<=10; i++){
            System.out.printf(""+i);

            for (int j=1;j<=10;j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
