package br.com.treeway.banco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by eduardohilario on 12/07/17.
 */
public class Conta {
    private int numero;
    private double saldo;
    private String titular;
    private LocalDate dataAbertura;

    public Conta(){


        this.dataAbertura = LocalDate.now();
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
