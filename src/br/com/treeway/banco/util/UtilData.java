package br.com.treeway.banco.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by eduardohilario on 12/07/17.
 */
public class UtilData {
    static public int DOMINGO = Calendar.SUNDAY;
    static public int SEGUNDA = Calendar.MONDAY;
    static public int TERCA = Calendar.TUESDAY;
    static public int QUARTA = Calendar.WEDNESDAY;
    static public int QUINTA = Calendar.THURSDAY;
    static public int SEXTA = Calendar.FRIDAY;
    static public int SABADO = Calendar.SATURDAY;

    static public int JANEIRO = Calendar.JANUARY;
    static public int FEVEREIRO= Calendar.FEBRUARY;
    static public int MARCO = Calendar.MARCH;
    static public int ABRIL = Calendar.APRIL;
    static public int MAIO = Calendar.MAY;
    static public int JUNHO = Calendar.JUNE;
    static public int JULHO = Calendar.JULY;
    static public int AGOSTO = Calendar.AUGUST;
    static public int SETEMBRO = Calendar.SEPTEMBER;
    static public int OUTUBRO = Calendar.OCTOBER;
    static public int NOVEMBRO = Calendar.NOVEMBER;
    static public int DEZEMBRO = Calendar.DECEMBER;

    public static int diaDoMes = Calendar.DAY_OF_MONTH;
    public static int diaDaSemana = Calendar.DAY_OF_WEEK;

    static {

        System.out.println("Entrando no bloco Estático");
        LocalDate hoje = LocalDate.now();
        System.out.println("Saindo do método estático data = " + formateData(hoje));

    }

    static LocalDate formateData(LocalDate data){
        DateTimeFormatter formateData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data.format(formateData);
        return data;
    }





}
