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
}
