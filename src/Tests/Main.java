package Tests;

import Enums.TipoSeguro;
import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.emailCli = "pedrodasilva@gmail.com";
        pedro.nmCli = "Pedro da Silva";
        pedro.setCpfCli(29888419909L);
        pedro.setSenhaCli("senha##98");
        pedro.setTelCli(11949022803L);
        pedro.exibirInformacoes();

        pedro.atualizarInformacoes(0, 11980845779L, "Senha2##", "pedrodasilva@hotmail.com", null );
        System.out.println("\n+++++++++++++\n"  );
        pedro.exibirInformacoes();


        ClienteSegurado maria = new ClienteSegurado();
        maria.emailCli = "marialima@gmail.com";
        maria.setCodigoSeguro(1234);
        maria.setTipoSeguro(TipoSeguro.Completo);
        System.out.println("\n+++++++++++++\n");
        maria.exibirInformacoes();
        maria.atualizarInformacoes(22804955109L, 119847275627L, "SENHA2990", null, "Mario", 2358, TipoSeguro.SemiSegurado);
        System.out.println("\n+++++++++++++\n");
        maria.exibirInformacoes();

        ClienteSegurado cliente2 = new ClienteSegurado();
        cliente2.nmCli = "Felipe";
        List<ClienteSegurado> clienteSegurados = ClienteSegurado.getClientesSegurados();
        System.out.println("\n+++++++++++++\nClientes Segurados: ");
        for (ClienteSegurado clienteSegurado : clienteSegurados){
            System.out.println(clienteSegurado.nmCli);
        }





        Veiculo carro1 = new Veiculo();
        carro1.cliente = maria;
        carro1.marcaVeiculo = "FORD";
        carro1.modeloVeiculo = "KA";
        carro1.placaVeiculo = "ELM8979";
        carro1.setIdVeiculo(11234);
        System.out.println("\n+++++++++++++\n");
        carro1.exibirInformacoes();

        Seguradora seguro1 = new Seguradora(550123, "LIberty Porto Seguro", "");
        System.out.println("\n+++++++++++++\n" + seguro1.verificarCobertura());








        Localizacao est1 = new Localizacao();
        System.out.println(est1.calcularDistancia());
    }
}