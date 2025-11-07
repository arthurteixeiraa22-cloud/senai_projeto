package ATV20;

import java.util.Locale;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        String[]vect=new String[]{"pedro","caiox","joão"};
       for (String obj:vect){
           System.out.println(obj);
       }
    }
}
