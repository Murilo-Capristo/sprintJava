package Models;

public class Peca {
    private int idPeca;
    public int quantPeca;
    public Manutencao manutencao;
    public float precoPeca;
    public int nmPeca;

    public void verificarDisponibilidade(boolean disponivel){
        if (disponivel){
            System.out.println("Peça: " + this.nmPeca + " disponível!");
        }
        else{
            System.out.println("Peça: " + this.nmPeca + " indisponível!");
        }
    }

    public int getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }
}
