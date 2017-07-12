package br.com.treeway.banco.teste;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

/**
 * Created by eduardohilario on 12/07/17.
 */
public class TestandoJavaTime {
    public static void main(String[] args) {
        //Retorna o exato instante
        Instant agora = Instant.now();
        System.out.println(agora);

        //Retonra a data
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        //Compara datas
        LocalDate nascimento = LocalDate.of(1988,4,10);
        Period periodo = Period.between(nascimento,hoje);
        System.out.printf("%s anos, %s meses e %s dias.", periodo.getYears(),
                periodo.getMonths(), periodo.getDays());


    }
}
