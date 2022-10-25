import models.FacadeViagem;
import models.Hoteis;
import models.Voos;

public class Main {
    public static void main(String[] args) {

        FacadeViagem facade = new FacadeViagem();

        Voos voos = new Voos("24102022","26102022","Betim","Madrid");
        Hoteis hoteis = new Hoteis("24102022","26102022","Madrid");
        System.out.println(facade.viagem(voos,hoteis));
    }
}