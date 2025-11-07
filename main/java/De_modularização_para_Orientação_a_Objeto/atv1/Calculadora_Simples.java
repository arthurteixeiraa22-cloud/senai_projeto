package De_modularização_para_Orientação_a_Objeto.atv1;

public class Calculadora_Simples {
    public double num1 ;
    public double num2 ;
    public String opcao;

    public char max() {
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

