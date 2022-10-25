package models;

public class FacadeViagem {
    private ApiViagem apiViagem;

    public FacadeViagem(){
        apiViagem = new ApiViagem();
    }

    public String viagem(Voos voos, Hoteis hoteis){
        String viagem;

        viagem = apiViagem.viagem(voos,hoteis);
        System.out.println("Sua escolha de voo foi: Data de Partida= "+voos.getPartida()+" Data de retorno= "+voos.getRetorno()
                +" Origem= " +voos.getOrigem()+" Destino= "+voos.getDestino());
        System.out.println("Sua escolha de hotel foi: Data de entrada= "+hoteis.getEntrada()+" Data saida= "+hoteis.getSaida()
        +" Cidade= "+hoteis.getCidade());
        return viagem;

    }

}

