package ATV20;

import java.util.Locale;
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String H = sc.nextLine().trim().toLowerCase();
        System.out.println("digite os e-mail por virula");
        String linha = sc.nextLine();
        String[] emails = linha.split(",");
        for (int i = 0; i < emails.length; i++) {
            emails[i] = emails[i].trim().toLowerCase();
        }
        System.out.println("todos os e-mails (normalizados)");
        for (String email : emails) {
            System.out.println(email);
        }
        System.out.println("E-mails unicos: ");
        String[]unicos=new String[emails.length];
        int countUnicos=0;
        for (String email:emails){
            boolean jaExiste=false;
            for (int i=0;i<countUnicos;i++){
                if (email.equalsIgnoreCase(unicos[i])){
                    jaExiste=true;
                    break;
                }
            }
            if (!jaExiste){
                unicos[countUnicos]=email;
                countUnicos++;
            }
        }
        for (int i=0;i<countUnicos;i++){
            System.out.println(unicos[i]);
        }
        sc.close();
    }
}
