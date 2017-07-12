package br.com.treeway.banco;

/**
 * Created by eduardohilario on 12/07/17.
 */
public class ContaService {

    public void deposite(Conta contaDestino, double valor){

        contaDestino.setSaldo(contaDestino.getSaldo()+valor);
    }

    public void saque(Conta contaSaque, double valor){

        contaSaque.setSaldo(contaSaque.getSaldo()-valor);
    }

    public void transfere(Conta contaSaque, double valor, Conta contaDestino){

        this.saque(contaSaque, valor);
        this.deposite(contaDestino, valor);
    }


}
