package br.com.treeway.banco.teste;

import br.com.treeway.banco.Conta;
import br.com.treeway.banco.ContaService;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by eduardohilario on 12/07/17.
 */
public class TesteConta {

    public static void main(String[] args) {
        DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Objeto para ler dados do console
        Scanner scanner = new Scanner(System.in);

        //Variavel que recebe o numero da conta
        System.out.print("Digite o número da conta ");
        int numeroConta = scanner.nextInt();

        //Variavel que recebe o saldo inicial
        System.out.print("Digite o saldo inicial da conta: R$ ");
        double saldoConta = scanner.nextDouble();

        //Cria instancias para Conta e ContaService
        ContaService operacoesConta = new ContaService();
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        //Verificar Data de Abertura
        System.out.println("Data de Abertura da Conta 1: "+conta1.getDataAbertura().format(formataData));
        System.out.println("Data de Abertura da Conta 2: "+conta2.getDataAbertura().format(formataData));
        System.out.println("Data de Abertura da Conta 3: "+conta3.getDataAbertura().format(formataData));

        //Configura os atributos do objeto Conta1
        conta1.setSaldo(saldoConta);
        conta1.setNumero(numeroConta);

        //Configura os atributos do objeto Conta1 e Conta2
        conta2.setSaldo(0);
        conta2.setNumero(1002);
        conta3.setSaldo(0);
        conta3.setNumero(1003);

        //Mostra dados da conta1
        System.out.println("Conta: "+conta1.getNumero() + " | Saldo: R$ "+conta1.getSaldo());

        //Depositando na conta1
        System.out.print("\nDigite o valor para deposito na Conta: "+conta1.getNumero()+". R$ ");
        operacoesConta.deposite(conta1, scanner.nextDouble());
        System.out.print("Deposito realizado! Saldo Atual: R$ "+conta1.getSaldo());

        //Debito na conta1
        System.out.print("\nDigite o valor para debito na Conta: "+conta1.getNumero()+". R$ ");
        operacoesConta.saque(conta1, scanner.nextDouble());
        System.out.print("Deposito realizado! Saldo Atual: R$ "+conta1.getSaldo());

        //Mostra saldo das contas
        System.out.println("\nSaldo da Conta: "+conta1.getNumero()+". R$ "+conta1.getSaldo());
        System.out.println("Saldo da Conta: "+conta2.getNumero()+". R$ "+conta2.getSaldo());
        System.out.println("Saldo da Conta: "+conta3.getNumero()+". R$ "+conta3.getSaldo());

        //Transferindo valores
        System.out.println("Tranferencia entre contas: R$100,00 para conta 1002 e 50 para conta 1003");
        operacoesConta.transfere(conta1,100,conta2);
        operacoesConta.transfere(conta1,50,conta3);

        //Mostra saldo das contas
        System.out.println("Saldo da Conta: "+conta1.getNumero()+". R$ "+conta1.getSaldo());
        System.out.println("Saldo da Conta: "+conta2.getNumero()+". R$ "+conta2.getSaldo());
        System.out.println("Saldo da Conta: "+conta3.getNumero()+". R$ "+conta3.getSaldo());
    }
}
