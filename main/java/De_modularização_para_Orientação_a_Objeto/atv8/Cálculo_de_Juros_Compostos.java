package De_modularização_para_Orientação_a_Objeto.atv8;

public class Cálculo_de_Juros_Compostos {
    public double capital;
    public double taxa;
    public int periodos;
    public double calcular() {
        double montante = capital;
        int i = 0;
        while (i < periodos) {
            montante += montante * (taxa / 100);
            i++;
        }
        return montante;
    }
}
