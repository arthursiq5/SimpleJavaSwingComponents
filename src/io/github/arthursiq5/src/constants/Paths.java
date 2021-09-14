/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.constants;

/**
 *
 * @author arthur.siqueira
 */
public enum Paths {
    ICONS("/io/github/arthursiq5/media/icons/"),
    MAIN_ICONS("/io/github/arthursiq5/media/icons/main/");

    String path;

    private Paths(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }

    @Override
    public String toString() {
        return this.path;
    }
}
