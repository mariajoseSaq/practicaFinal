/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Maria Jose
 */
public class Elemento {
    private String denominacion;
    private int tipo;
    private int numFich;
    private int numDatL;
    
    public Elemento(String n,int t, int nf, int nd)
    {
     this.denominacion=n;
     this.numFich=nf;
     this.numDatL=nd;
     this.tipo=t;
    }

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the numFich
     */
    public int getNumFich() {
        return numFich;
    }

    /**
     * @param numFich the numFich to set
     */
    public void setNumFich(int numFich) {
        this.numFich = numFich;
    }

    /**
     * @return the numDatL
     */
    public int getNumDatL() {
        return numDatL;
    }

    /**
     * @param numDatL the numDatL to set
     */
    public void setNumDatL(int numDatL) {
        this.numDatL = numDatL;
    }
}
