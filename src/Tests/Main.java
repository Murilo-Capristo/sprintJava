package Tests;

import Enums.TipoSeguro;
import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanTxt = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);
        Random numRandom = new Random();


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

        Seguradora seguro1 = new Seguradora(550123, "LIberty Porto Seguro", null);
        System.out.println("\n+++++++++++++\n" + seguro1.verificarCobertura());
        System.out.println("\n+++++++++++++\n"); seguro1.adicionarCobertura();
        System.out.println("\n+++++++++++++\n" + seguro1.verificarCobertura());

        Servico consertoDeCapo = new Servico("Conserto de Capô", 3, 80, seguro1);
        System.out.println("\n+++++++++++++\nServiço " + consertoDeCapo.nmServ + " com preço inical de R$" + consertoDeCapo.precoServ + ", feito em  " + consertoDeCapo.tempoDuracaoServPHora + "h terá o preço final de R$"+consertoDeCapo.calcularPrecoTotal());
        System.out.println("ID do Serviço: " + consertoDeCapo.getIdServ());


        Servico novoServico = new Servico();
        System.out.println("\n+++++++++++++\nQual o tipo de serviço: ");
        novoServico.nmServ = scanNum.nextLine();
        novoServico.gerarDuracaoServPHora();
        novoServico.gerarValorServico();
        System.out.println("Para esse tipo de serviço: " +novoServico.nmServ + ", o preço final fica R$"+ novoServico.calcularPrecoTotal());

        Diagnostico novoDiag = new Diagnostico(novoServico, ("Diagnóstico " + novoServico.nmServ), 49.90f);
        System.out.println(novoDiag.classificarDiagnostico(("O cliente teve o" + novoServico.nmServ + ", o problema será resolvido logo, temos todas as peças para consertar o carro do cliente. ")));;








        Localizacao est1 = new Localizacao();
        System.out.println(est1.calcularDistancia());
    }
}