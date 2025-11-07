package De_modularização_para_Orientação_a_Objeto.atv9;

public class Classificador_de_Idade {
   public int idade;
    public String classificar() {
        if (idade < 0) {
            return "Idade inválida!";
        } else if (idade <= 12) {
            return "Infantil";
        } else if (idade <= 17) {
            return "Adolescente";
        } else if (idade <= 59) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}
