package Models;

import java.util.Random;

public class Manutencao extends Servico{
    Random id = new Random();
    private int idManu = id.nextInt(9999);
    public int dtManu;
    public float valorTotalManu = 50;
    public float horaManu;
    public Servico servico;

    public Manutencao(Servico servico, int dtManu, float horaManu) {
        if(servico != null){
            this.servico = servico;
        }
        this.dtManu = dtManu;
        this.horaManu = horaManu;
    }

    @Override
    public String toString() {
        return "Manutencao{" +
                "ID Manutenção=" + this.idManu +
                "Data da Manutenção=" + this.dtManu +
                "Valor Total da Manutenção=" + this.valorTotalManu +
                "Hora da Manutenção=" + this.horaManu +
                "Servico=" + servico.nmServ + '}';
    }

    public float calcularPrecoPorHora(){
        return (servico.tempoDuracaoServPHora + 1) * this.valorTotalManu;
    }

    public int getIdManu() {
        return idManu;
    }

    public void setIdManu(int idManu) {
        this.idManu = idManu;
    }
}
