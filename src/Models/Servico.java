package Models;

import java.util.Random;

public class Servico {
    Random id = new Random();
    private int idServ = id.nextInt(9999);
    public String nmServ;
    public float tempoDuracaoServPHora;
    public float precoServ;
    public Seguradora seguradora;

    public void gerarDuracaoServPHora(){
        if(this.tempoDuracaoServPHora == 0){
            Random random = new Random();
            this.tempoDuracaoServPHora = random.nextFloat(1,3);
        }
    }

    public void gerarValorServico(){
        if(this.precoServ == 0){
            Random random = new Random();
            this.precoServ = random.nextFloat(80,200);
        }
    }

    public Servico(){}

    public Servico(String nmServ, float tempoDuracaoServPHora, float precoServ, Seguradora seguradora) {
        this.nmServ = nmServ;
        this.tempoDuracaoServPHora = tempoDuracaoServPHora;
        this.precoServ = precoServ;
        this.seguradora = seguradora;
    }

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
