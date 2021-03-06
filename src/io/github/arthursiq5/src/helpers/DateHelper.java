/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.helpers;

import io.github.arthursiq5.src.constants.DateFormats;
import io.github.arthursiq5.src.constants.Meses;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Arrays;

/**
 *
 * @author arthur
 */
public class DateHelper {

    public static String dateToString(Date date, DateFormats format){
        SimpleDateFormat formato = new SimpleDateFormat(format + "", Locale.US);
        return formato.format(date);
    }
    
    public static String dateToString(Date date) {
        SimpleDateFormat formato = new SimpleDateFormat(DateFormats.ISO_DATETIME + "", Locale.US);
        return formato.format(date);
    }

    public static Date stringToDate(String date) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat(DateFormats.ISO_DATETIME + "", Locale.US);
        return formato.parse(date);
    }

    public static int[] monthToDays(Meses mes) {
        int[] dias = new int[mes.getQuantidadeDeDias()];

        for (int i = 0; i < mes.getQuantidadeDeDias(); i++) {
            dias[i] = i + 1;
        }

        return dias;
    }

    public static int getCurrentYear() {
        Calendar anoAtual = Calendar.getInstance();
        return anoAtual.get(Calendar.YEAR);
    }

    public static int[] getPossibleYears() {
        int anoMinimo = 1970;
        int anoMaximo = DateHelper.getCurrentYear() + 11;

        int[] anosPossiveis = new int[anoMaximo - anoMinimo];

        for (int i = 0; i < (anoMaximo - anoMinimo); i++) {
            anosPossiveis[i] = anoMinimo + i;
        }

        return anosPossiveis;
    }

    public static Meses[] getPossibleMonths() {
        return Meses.values();
    }

    public static Meses checkMonth(String month) {
        Meses mes = Meses.JANEIRO;

        for (Meses possibleMonth : DateHelper.getPossibleMonths()) {
            if (DateHelper.stringEqualsMonth(month, possibleMonth)) {
                mes = possibleMonth;
            }
        }

        return mes;
    }

    public static boolean stringEqualsMonth(String str, Meses month) {
        return str.equalsIgnoreCase(month.toString());
    }

    public static void main(String[] args) {
        System.out.println("Dia de hoje: " + DateHelper.dateToString(new Date()));

        try {
            System.out.println("Data de hoje: " + DateHelper.stringToDate("2020-05-15 13:00:25"));
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int possibleYear : DateHelper.getPossibleYears()) {
            System.out.println("Ano: " + possibleYear);
        }

        Arrays.asList(Meses.values()).forEach((month) -> {
            System.out.print(month.name());
            System.out.print(" -> ");
            System.out.println(month.getQuantidadeDeDias());
        });
    }
}
