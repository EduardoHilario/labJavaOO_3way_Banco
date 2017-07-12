package br.com.treeway.banco.teste;

import br.com.treeway.banco.util.UtilData;

/**
 * Created by eduardohilario on 12/07/17.
 */
public class TentandoVariavelEstatica {

    public static void main(String[] args) {

        //Acessando variaveis estaticas
        System.out.println("Dia da Semana: "+ UtilData.DOMINGO);
        System.out.println("Dia da Semana: "+ UtilData.TERCA);
        System.out.println("Dia da Semana: "+ UtilData.QUARTA);
        System.out.println("Dia da Semana: "+ UtilData.SABADO);

        //Acessando variaveis de instancia
        UtilData data = new UtilData();
        System.out.println("Mês do Ano: "+ data.JANEIRO);
        System.out.println("Mês do Ano: "+ data.FEVEREIRO);
        System.out.println("Mês do Ano: "+ data.MARCO);
        System.out.println("Mês do Ano: "+ data.ABRIL);
        System.out.println("Mês do Ano: "+ data.MAIO);
        System.out.println("Mês do Ano: "+ data.JUNHO);
        System.out.println("Mês do Ano: "+ data.JULHO);
        System.out.println("Mês do Ano: "+ data.AGOSTO);
        System.out.println("Mês do Ano: "+ data.SETEMBRO);
        System.out.println("Mês do Ano: "+ data.OUTUBRO);
        System.out.println("Mês do Ano: "+ data.NOVEMBRO);
        System.out.println("Mês do Ano: "+ data.DEZEMBRO);


    }
}
