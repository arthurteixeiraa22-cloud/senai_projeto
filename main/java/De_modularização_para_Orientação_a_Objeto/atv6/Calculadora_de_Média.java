package De_modularização_para_Orientação_a_Objeto.atv6;

public class Calculadora_de_Média {
    public int quantidade;
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length;i++) {
            soma+=notas[i];
        }
        return soma/notas.length;
    }
}

