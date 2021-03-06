/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.helpers;

/**
 *
 * @author arthur.siqueira
 */
public class FormatHelper {

    public static boolean isNumeric(String value) {
        boolean isNumeric;
        try {
            double aux = (Double.parseDouble(value));
            isNumeric = true;
        } catch (NumberFormatException e) {
            isNumeric = false;
        }

        return isNumeric;
    }

    public static boolean charExists(String message, char comparator) {
        System.out.println("char: " + comparator);
        System.out.println("char exists: " + message.contains(comparator + ""));
        return message.contains(comparator + "");
    }

    public static void main(String[] args) {
        System.out.println("Testes com isNumeric");
        System.out.println("------------\\\\\\------------");
        System.out.println("\"15\" is number: " + FormatHelper.isNumeric("15"));
        System.out.println("\"\" is number: " + FormatHelper.isNumeric(""));
        System.out.println("\"4b5\" is number: " + FormatHelper.isNumeric("4b5"));
        System.out.println("\"ãÃç\" is number: " + FormatHelper.isNumeric("ãÃç"));
        System.out.println("\"0,01\" is number: " + FormatHelper.isNumeric("0,01"));
        System.out.println("\"0.01\" is number: " + FormatHelper.isNumeric("0.01"));

        System.out.println("caractere \",\" existe na string \"123,45\": " + FormatHelper.charExists("123,45", ','));
        System.out.println("caractere \",\" existe na string \"12345\": " + FormatHelper.charExists("12345", ','));
    }
}
