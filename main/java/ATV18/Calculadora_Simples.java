package ATV18;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora_Simples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primero numero");
        double num1 = sc.nextDouble();
        System.out.println("insira o segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("escolha a operação");
        System.out.println("/");
        System.out.println("*");
        System.out.println("+");
        System.out.println("-");
        String opcao = sc.next();
        System.out.println(max(opcao, num1, num2));
    }

    public static char max(String opcao, double num1, double num2) {
        double resultado = 0;
        if (opcao.equalsIgnoreCase("/")) {
            resultado = num1 / num2;
        } else if (opcao.equalsIgnoreCase("*")) {
            resultado = num1 * num2;
        } else if (opcao.equalsIgnoreCase("+")) {
            resultado = num1 + num2;
        } else if (opcao.equalsIgnoreCase("-")) {
            resultado = num1 - num2;
        }
        System.out.print("o resultado da operação " + resultado);
        return 0;
    }
}
