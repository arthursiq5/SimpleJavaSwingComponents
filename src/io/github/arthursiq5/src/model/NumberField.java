/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.model;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author arthur.siqueira
 */
public class NumberField {

    public JTextField campo;
    public KeyEvent evento;

    public NumberField(JTextField campo, KeyEvent evento) {
        this.campo = campo;
        this.evento = evento;
    }
}
