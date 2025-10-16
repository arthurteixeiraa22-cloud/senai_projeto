package desafio_de_programação;

import java.util.Scanner;

public class desafio07 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        System.out.print("Digite o primeiro número inteiro positivo: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número inteiro positivo: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Os números devem ser inteiros positivos.");
        } else {
            while (b != 0) {
                int resto = a % b;
                a = b;
                b = resto;
            }

            System.out.println("O Máximo Divisor Comum (MDC) é: " + a);
        }

        sc.close();
    }
}


