package models;

import java.util.Date;
import java.util.SplittableRandom;

public class Hoteis {

    private String entrada;
    private String saida;
    private String cidade;

    public Hoteis(String entrada, String saida, String cidade) {
        this.entrada = entrada;
        this.saida = saida;
        this.cidade = cidade;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
