package Models;

import java.util.Random;

public class Diagnostico extends Servico{
    Random id = new Random();
    private int idDiag = id.nextInt(9999);
    public String nmDiag;
    public Servico servico;
    public float precoDiag;

    public Diagnostico( Servico servico, String nmDiag, float precoDiag) {
        if (servico != null){
            this.servico = servico;
        }
        this.nmDiag = nmDiag;
        this.precoDiag = precoDiag;
    }

    public String classificarDiagnostico(String diagnostico) {
        return "\n***********\nDiagnostico{" +
                "\nID Diagnóstico=" + this.idDiag +
                "\nNome Diagnóstico=" + this.nmDiag +
                "\nPreço Diagnóstico=" + this.precoDiag +
                "\nNome do Serviço=" + servico.nmServ +
                "\nTempo de Duracao do Serviço=" + servico.tempoDuracaoServPHora +
                "\nPreco do Serviço=" + servico.calcularPrecoTotal() +
                "\nSeguradora=" + servico.seguradora +
                '}' + "\nInformações: " + diagnostico;
    }
    public int getIdDiag() {
        return idDiag;
    }

    public void setIdDiag(int idDiag) {
        this.idDiag = idDiag;
    }
}
