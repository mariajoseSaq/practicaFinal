/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Elemento;
import Modelo.Proyecto;

/**
 *
 * @author Maria Jose
 */
public class Controlador {

    private Proyecto pr;

    public Controlador() {
        pr = new Proyecto("Practica Final");
    }

    public boolean AddElto(String nom, int t, int nF, int nD) {
        Elemento e = new Elemento(nom, t, nF, nD);
        if (pr.getListaEltos().contains(e)) {
            return false;
        } else {
            pr.agregarElto(e);
            return true;
        }
    }
}
