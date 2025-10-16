package desafio_de_programação;

import java.util.Locale;
import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro de até 7 digitos");
        int numero = sc.nextInt();

        int original=numero;
        int invertido= 0;

        while (numero>0){
            int digito=numero%10;
            invertido=invertido*10+digito;
            numero=numero/10;
        }
        if (original== invertido){
            System.out.println("o numero "+original+" é um palindromo.");
        }else {
            System.out.println("O número "+original+" não é um palidromo.");
        }
        System.out.println("Digite uma palavra: ");
        String palavra= sc.next();

        boolean ehPalindromo=true;
        int tamanho=palavra.length();

        for (int i=0; i<tamanho/2; i++){
            if (palavra.charAt(i)!=palavra.charAt(tamanho-1-i)){
                ehPalindromo=false;
                break;
            }
        }
        if (ehPalindromo){
            System.out.println("A palavra "+palavra+"é um palidromo.");
        }else {
            System.out.println("A palavra"+palavra+"não é um palidromo.");
        }

        sc.close();
    }
}