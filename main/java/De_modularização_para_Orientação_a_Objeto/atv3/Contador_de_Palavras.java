package De_modularização_para_Orientação_a_Objeto.atv3;

public class Contador_de_Palavras {
    public String frase;
    public int contador() {
        String[] palavras = frase.trim().split(" ");
        int contador = 0;
        int i = 0;
        while (i < palavras.length) {
            for (int j = 0; j < 1; j++) {
                contador++;
            }
            i++;
        }
        return contador;
    }
}
