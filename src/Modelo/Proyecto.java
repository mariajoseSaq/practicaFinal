/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Maria Jose
 */
public class Proyecto {

    private String nombre;
    private ArrayList<Elemento> listaEltos;
    private ArrayList<Integer> caracteristicas;
    private int PFNA, SVA;
    private double FA, PFA;

    public Proyecto(String nom) {
        this.nombre = nom;
        listaEltos = new ArrayList();
        caracteristicas = new ArrayList();
    }

    
    public void agregarElto(Elemento e){
    listaEltos.add(e);
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the listaEltos
     */
    public ArrayList<Elemento> getListaEltos() {
        return listaEltos;
    }

    /**
     * @param listaEltos the listaEltos to set
     */
    public void setListaEltos(ArrayList<Elemento> listaEltos) {
        this.listaEltos = listaEltos;
    }

    /**
     * @return the caracteristicas
     */
    public ArrayList<Integer> getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(ArrayList<Integer> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the PFNA
     */
    public int getPFNA() {
        return PFNA;
    }

    /**
     * @param PFNA the PFNA to set
     */
    public void setPFNA(int PFNA) {
        this.PFNA = PFNA;
    }

    /**
     * @return the SVA
     */
    public int getSVA() {
        return SVA;
    }

    /**
     * @param SVA the SVA to set
     */
    public void setSVA(int SVA) {
        this.SVA = SVA;
    }

    /**
     * @return the FA
     */
    public double getFA() {
        return FA;
    }

    /**
     * @param FA the FA to set
     */
    public void setFA(double FA) {
        this.FA = FA;
    }

    /**
     * @return the PFA
     */
    public double getPFA() {
        return PFA;
    }

    /**
     * @param PFA the PFA to set
     */
    public void setPFA(double PFA) {
        this.PFA = PFA;
    }

}
