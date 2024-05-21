package Models;

public class Veiculo implements ExibirInformacoes{
    private int idVeiculo;
    public String marcaVeiculo;
    public String placaVeiculo;
    public String modeloVeiculo;
    public Cliente cliente;

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    public void exibirInformacoes() {
        System.out.println("Veiculo\n" +
                "IdVeiculo: " + this.idVeiculo +
                "\nMarcaVeiculo: " + this.marcaVeiculo +
                "\nPlacaVeiculo: " + this.placaVeiculo +
                "\nModeloVeiculo: " + this.modeloVeiculo +
                "\nCliente: " + this.cliente.nmCli);
    }
}

