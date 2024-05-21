package Models;

import java.util.Random;

public class Diagnostico extends Servico{
    Random id = new Random();
    private int idDiag = id.nextInt(9999);
    public String nmDiag;
    public float precoDiag;

    public String classificarDiagnostico(String diagnostico) {
        return "Diagnostico{" +
                "\nidDiag=" + this.idDiag +
                "\nnmDiag='" + this.nmDiag +
                "\nprecoDiag=" + this.precoDiag +
                "\nnmServ='" + super.nmServ +
                "\ntempoDuracaoServ=" + super.tempoDuracaoServPHora +
                "\nprecoServ=" + super.precoServ +
                "\nseguradora=" + super.seguradora +
                '}' + "\nInformações: " + diagnostico;
    }
    public int getIdDiag() {
        return idDiag;
    }

    public void setIdDiag(int idDiag) {
        this.idDiag = idDiag;
    }
}
