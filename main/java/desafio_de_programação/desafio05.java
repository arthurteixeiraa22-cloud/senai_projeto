package desafio_de_programação;

import java.util.Locale;
import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite um numero");
        int n= sc.nextInt();

        for (int i=1;i<= n; i++){
            for (int espacos=n-i;espacos>0;espacos--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
