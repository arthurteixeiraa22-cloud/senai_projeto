package atv17_DO_WHILE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //RFID e a cigla para intificação por radio frequencia
        String leito;

        do {
            System.out.println("informe os caracteris do codigo: ");
            leito = sc.nextLine();
            if (leito.length() != 8) {
                System.out.println("codigo invalido");
                System.out.println("tente novamente");
                leito = sc.nextLine();
            }
        } while (leito.length() != 8);
        System.out.println("codigo aceito ");
    }
}
