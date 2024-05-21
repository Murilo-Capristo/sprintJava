package Models;

import java.util.Random;

public class Servico {
    Random id = new Random();
    private int idServ = id.nextInt(9999);
    public String nmServ;
    public float tempoDuracaoServPHora;
    public float precoServ;
    public Seguradora seguradora;

    public float calcularPrecoTotal(){
        float precoTotal = this.precoServ * (tempoDuracaoServPHora + 1);
        return precoTotal;

    }

    public int getIdServ() {
        return idServ;
    }

    public void setIdServ(int idServ) {
        this.idServ = idServ;
    }
}
