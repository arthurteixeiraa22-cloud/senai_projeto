package ATV18;

import java.util.Locale;
import java.util.Scanner;

public class Contador_de_Palavras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("====contador de palavras====");
        System.out.println("digite uma frase e o programa contara quantas palavras ela possui");
        System.out.println("frase: ");
        String frase = sc.nextLine();
        int total = contadorDePalavras.contador(frase);
        System.out.println("A frase digitada contem " + total + " palavra(s).");
        sc.close();
    }

    class contadorDePalavras {
        public static int contador(String frase) {
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
}
