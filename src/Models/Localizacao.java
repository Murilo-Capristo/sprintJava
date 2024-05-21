package Models;

import java.util.Random;

public class Localizacao {
    public String enderecoLoc;
    public String idLoc;
    public int cep;
    public Estabelecimento estabelecimento;

    public String calcularDistancia(){
        Random distancia = new Random();
        return "O estabelecimento mais próximo fica a " + distancia.nextInt(20) + " minutos.";

    }
}
