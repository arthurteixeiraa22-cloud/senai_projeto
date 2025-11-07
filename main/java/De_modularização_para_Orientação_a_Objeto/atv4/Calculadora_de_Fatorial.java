package De_modularização_para_Orientação_a_Objeto.atv4;

public class Calculadora_de_Fatorial {
    public int numero;

    public long calculadora() {
        long fatorial = 1;
        int i = numero;
        while (i > 1) {
            fatorial *= i;
            i--;
        }
        return fatorial;
    }
}

