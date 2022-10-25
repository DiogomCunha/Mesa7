package models;

import java.util.Date;

public class Voos {
     private String partida;
     private String retorno;
     private String origem;
     private String destino;

    public Voos(String partida, String retorno, String origem, String destino) {
        this.partida = partida;
        this.retorno = retorno;
        this.origem = origem;
        this.destino = destino;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
