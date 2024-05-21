package Models;

import java.util.Random;

public class Manutencao extends Servico{
    Random id = new Random();
    private int idManu = id.nextInt(9999);
    public int dtManu;
    public float valorTotalManu = 50;
    public float horaManu;

    public float calcularPrecoPorHora(){
       float precoPorHora = (super.tempoDuracaoServPHora + 1) * this.valorTotalManu;
       return precoPorHora;
    }

    public int getIdManu() {
        return idManu;
    }

    public void setIdManu(int idManu) {
        this.idManu = idManu;
    }
}
