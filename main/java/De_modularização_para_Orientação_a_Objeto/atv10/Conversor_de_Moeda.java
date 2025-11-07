package De_modularização_para_Orientação_a_Objeto.atv10;

public class Conversor_de_Moeda {
    public int opcao;
    public String entrada;

    private static final double COTACAO_DOLAR = 5.2;
    private static final double COTACAO_EURO = 5.8;

    public double realParaDolar(double r) {
        return r / COTACAO_DOLAR;
    }

    public double realParaEuro(double r) {
        return r / COTACAO_EURO;
    }

    public  double dolarParaReal(double d) {
        return d * COTACAO_DOLAR;
    }

    public  double euroParaReal(double e) {
        return e * COTACAO_EURO;
    }
}

