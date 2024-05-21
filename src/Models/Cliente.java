package Models;

public class Cliente implements ExibirInformacoes{
    private long cpfCli;
    private long telCli;
    private String senhaCli;
    public String emailCli;
    public String nmCli;

    public Cliente(){}

    public Cliente(long cpfCli, long telCli, String senhaCli, String emailCli, String nmCli) {
        this.cpfCli = cpfCli;
        this.telCli = telCli;
        this.senhaCli = senhaCli;
        this.emailCli = emailCli;
        this.nmCli = nmCli;
    }

    public long getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(long cpfCli) {
        this.cpfCli = cpfCli;
    }

    public long getTelCli() {
        return telCli;
    }

    public void setTelCli(long telCli) {
        this.telCli = telCli;
    }

    public String getSenhaCli() {
        return senhaCli;
    }

    public void setSenhaCli(String senhaCli) {
        this.senhaCli = senhaCli;
    }

    public void atualizarInformacoes(long novoCpf, long novoTel, String novaSenha, String novoEmail, String novoNome){

        if (novoNome != null){
            this.nmCli = novoNome;}
        if (novoTel != 0){
            this.telCli = novoTel;}
        if (novaSenha != null){
            this.senhaCli = novaSenha;}
        if (novoCpf != 0){
            this.cpfCli = novoCpf;}
        if (novoEmail != null){
        this.emailCli = novoEmail;}

    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nmCli +
                "\nEmail: " + this.emailCli +
                "\nCpf: " + this.cpfCli +
                "\nTelefone: " + this.telCli +
                "\nSenha: " + this.senhaCli);
    }
}
