/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.helpers;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author arthur.siqueira
 */
public class IconHelper {

    public static ImageIcon getPngIcon(String name) {
        return new IconHelper().getStaticPngIcon(name);
    }

    public ImageIcon getStaticPngIcon(String name) {
        return new ImageIcon(getClass().getResource(name));
    }

    private Image getStaticPngImage(String name) {
        URL iconPath = getClass().getResource(name);
        return Toolkit.getDefaultToolkit().getImage(iconPath);
    }

    public static Image getPngImage(String name) {
        return new IconHelper().getStaticPngImage(name);
    }
}
