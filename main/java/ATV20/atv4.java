package ATV20;

import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidade de notas");
        int n = sc.nextInt();
        int[] nota = new int[n];
        for (int rep : nota) {
            System.out.println("aluno");
            int notas = sc.nextInt();
            if (notas > 60) {
                System.out.println("aluno aprovado");
            } else {
                System.out.println("aluno reprovado");
            }
        }
    }
}
