package Models;

import Enums.TipoSeguro;

import java.util.ArrayList;
import java.util.List;

public class ClienteSegurado extends Cliente implements ExibirInformacoes{
    private static List<ClienteSegurado> clientesSegurados = new ArrayList<>();
    private int codigoSeguro;
    private TipoSeguro tipoSeguro;

    public ClienteSegurado(long cpfCli, long telCli, String senhaCli, String emailCli, String nmCli, int codigoSeguro, TipoSeguro tipoSeguro) {
        super(cpfCli, telCli, senhaCli, emailCli, nmCli);
        this.codigoSeguro = codigoSeguro;
        this.tipoSeguro = tipoSeguro;
        clientesSegurados.add(this);

    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Nome: " + super.nmCli +
                "\nEmail: " + super.emailCli +
                "\nCpf: " + super.getCpfCli() +
                "\nTelefone: " + super.getTelCli() +
                "\nSenha: " + super.getSenhaCli() +
                "\nCodigo Seguro: " + this.codigoSeguro +
                "\nTipo do Seguro: " + this.tipoSeguro);
    }

    public void atualizarInformacoes(long novoCpf, long novoTel, String novaSenha, String novoEmail, String novoNome, int novoCodSeguro, TipoSeguro novoTipoSeguro){

        if (novoNome != null) super.nmCli = novoNome;
        if (novoTel != 0) super.setCpfCli(novoTel);
        if (novaSenha != null) super.setSenhaCli(novaSenha);
        if (novoCpf != 0) super.setCpfCli(novoCpf);
        if (novoEmail != null) super.emailCli = novoEmail;
        if (novoCodSeguro != 0) this.codigoSeguro = novoCodSeguro;
        if (novoTipoSeguro != null) this.tipoSeguro = novoTipoSeguro;

    }


    @Override
    public long getCpfCli() {
        return getCpfCli();
    }

    @Override
    public void setCpfCli(long cpfCli) {
        this.setCpfCli(cpfCli);
    }

    @Override
    public long getTelCli() {
        return getTelCli();
    }

    @Override
    public void setTelCli(long telCli) {
        this.setTelCli(telCli);
    }

    @Override
    public String getSenhaCli() {
        return getSenhaCli();
    }

    @Override
    public void setSenhaCli(String senhaCli) {
        this.setSenhaCli(senhaCli);
    }

    public ClienteSegurado(){
        clientesSegurados.add(this);
        }

    public int getCodigoSeguro() {
        return codigoSeguro;
    }
    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public TipoSeguro getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(TipoSeguro tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public static List<ClienteSegurado> getClientesSegurados() {
        return clientesSegurados;
    }

    public static void setClientesSegurados(List<ClienteSegurado> clientesSegurados) {
        ClienteSegurado.clientesSegurados = clientesSegurados;
    }


}





