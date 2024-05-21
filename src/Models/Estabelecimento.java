package Models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {
    private int idEst;
    public int nmEst;
    public int horarioFunEst;
    public String enderecoEst;
    private static List<Veiculo> veiculosNoEst = new ArrayList<>();

    public void registrarChegadaVeiculoHrAtual(Veiculo veiculo){
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Veiculo chegou ás " + horaAtual);
        veiculo = new Veiculo();
        veiculosNoEst.add(veiculo);}
    public void registrarChegadaVeiculo(Veiculo veiculo, int horas, int minutos){
        System.out.println("Veiculo chegou ás " + horas + "h" + minutos);
        veiculo = new Veiculo();
        veiculosNoEst.add(veiculo);}

    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    public static List<Veiculo> getVeiculosNoEst() {
        return veiculosNoEst;
    }

    public static void setVeiculosNoEst(List<Veiculo> veiculosNoEst) {
        Estabelecimento.veiculosNoEst = veiculosNoEst;
    }
}
