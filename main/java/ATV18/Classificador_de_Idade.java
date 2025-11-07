package ATV18;

import java.util.Locale;
import java.util.Scanner;

public class Classificador_de_Idade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Classificador de Idade");
        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        String classificacao = classificar(idade);
        System.out.println("Classificação: " + classificacao);
        sc.close();
    }

    public static String classificar(int idade) {
        if (idade < 0) {
            return "Idade inválida!";
        } else if (idade <= 12) {
            return "Infantil";
        } else if (idade <= 17) {
            return "Adolescente";
        } else if (idade <= 59) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}
