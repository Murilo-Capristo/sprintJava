package Models;

public class Seguradora {
    private int idSeg;
    public String nmSeg;
    public String tipoDeCobertura = "Nenhuma";

    public Seguradora(int idSeg, String nmSeg, String tipoDeCobertura) {
        this.idSeg = idSeg;
        this.nmSeg = nmSeg;
        if(tipoDeCobertura.equals("")){
        this.tipoDeCobertura = tipoDeCobertura;}
    }

    public int getIdSeg() {
        return idSeg;
    }

    public void setIdSeg(int idSeg) {
        this.idSeg = idSeg;
    }

    public void adicionarCobertura(){
        this.tipoDeCobertura = "Com cobertura!";
        System.out.println("Seguro com cobertura!");
    }

    public String verificarCobertura(){
        return "Cobertura: " + this.tipoDeCobertura;
    }

}
