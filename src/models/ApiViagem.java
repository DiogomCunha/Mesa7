package models;

public class ApiViagem {
    public String viagem(Voos voos, Hoteis hoteis){

        if (voos.getDestino() == hoteis.getCidade()&&voos.getPartida()==hoteis.getEntrada()
                &&voos.getRetorno()==hoteis.getSaida()){

            return ("Hoteis e Voos disponiveis");
        }
        else {
            return ("A data de patida deve ser igual a data de entrada, a data de retorno deve ser igual a data de" +
                    "saida e o destino deve ser igual a cidade");
        }
    }
}
