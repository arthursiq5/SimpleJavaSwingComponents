/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.helpers;

import io.github.arthursiq5.src.constants.Icons;
import io.github.arthursiq5.src.constants.SystemColors;
import io.github.arthursiq5.src.model.NumberField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.border.BevelBorder;

/**
 *
 * @author arthur.siqueira
 */
public class ViewHelper {

    //
    public static void setButtonStyle(JButton button, SystemColors color, Icons icon) {
        button.setBackground(ColorHelper.getColor(color));
        button.setIcon(IconHelper.getPngIcon(icon.getFullPath()));
        button.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    }

    //
    public static void setButtonStyle(JToggleButton button, SystemColors color, Icons icon) {
        button.setBackground(ColorHelper.getColor(color));
        button.setIcon(IconHelper.getPngIcon(icon.getFullPath()));
        button.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    }

    public static void setEditButtonStyle(JButton button) {
        ViewHelper.setButtonStyle(button, SystemColors.LIGHT_GREEN, Icons.EDITAR_64);
    }

    public static void setDeleteButtonStyle(JButton button) {
        ViewHelper.setButtonStyle(button, SystemColors.LIGHT_RED, Icons.EXCLUIR_64);
    }

    public static void setClearSearchButtonStyle(JButton button) {
        ViewHelper.setButtonStyle(button, SystemColors.DEFAULT_BACKEND, Icons.APAGAR_16);
    }

    public static void setSearchButtonStyle(JButton button) {
        ViewHelper.setButtonStyle(button, SystemColors.DEFAULT_BACKEND, Icons.PESQUISAR_16);
    }

    public static void setSearch64ButtonStyle(JButton button) {
        ViewHelper.setButtonStyle(button, SystemColors.DEFAULT_BACKEND, Icons.PESQUISAR_64);
    }

    public static void setSubmitButtonStyle(JButton button) {
        ViewHelper.setButtonStyle(button, SystemColors.CONFIRM_GREEN, Icons.CHECK_64);
    }

    public static void setClearFormButtonStyle(JButton button) {
        ViewHelper.setButtonStyle(button, SystemColors.ERASE_BLUE, Icons.APAGAR_64);
    }

    public static void setCancel64ButtonStyle(JButton button) {
        ViewHelper.setButtonStyle(button, SystemColors.LIGHT_RED, Icons.CANCELAR_64);
    }

    public static void initButtons(
            JButton btnEditar,
            JButton btnExcluir,
            JButton btnPesquisar,
            JButton btnLimpar
    ) {
        ViewHelper.setEditButtonStyle(btnEditar);
        ViewHelper.setDeleteButtonStyle(btnExcluir);
        ViewHelper.setSearchButtonStyle(btnPesquisar);
        ViewHelper.setClearSearchButtonStyle(btnLimpar);
    }

    public static void initFormButtons(
            JButton btnLimpar,
            JButton btnCadastrar
    ) {
        ViewHelper.setSubmitButtonStyle(btnCadastrar);
        ViewHelper.setClearFormButtonStyle(btnLimpar);
    }

    private static void commaRepeated(NumberField numberField) {
        if (FormatHelper.charExists(numberField.campo.getText(), numberField.evento.getKeyChar())) {
            numberField.evento.consume();
        }
    }

    public static void eventNumberKeyTyped(NumberField numberField) {
        if (numberField.evento.getKeyChar() == '.') {
            numberField.evento.consume();
        }
        if (numberField.evento.getKeyChar() == ',') {
            ViewHelper.commaRepeated(numberField);
            return;
        }

        if (!ViewHelper.charIsNumeric(numberField.evento.getKeyChar())) {
            numberField.evento.consume();
        }
    }

    private static boolean charIsNumeric(char c) {
        return FormatHelper.isNumeric(c + "");
    }
}
