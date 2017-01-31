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
    
    //Rangos de dificultad:
    //0 Sencilla
    //1 Media
    //2 Compleja
    
    
   public int dificultadEntradaExterna(int numeroFicheros, int numeroDatosElementales) {
        int dificultad = 0;
        if (numeroFicheros <= 1) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 4) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 5 && numeroDatosElementales <= 15) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 16) {
                dificultad = 1;
            }
        } else if (numeroFicheros == 2) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 4) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 5 && numeroDatosElementales <= 15) {
                dificultad = 1;
            } else if (numeroDatosElementales >= 16) {
                dificultad = 2;
            }
        } else if (numeroFicheros >= 3) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 4) {
                dificultad = 1;
            } else if (numeroDatosElementales >= 5 && numeroDatosElementales <= 15) {
                dificultad = 2;
            } else if (numeroDatosElementales >= 16) {
                dificultad = 2;
            }
        }
        return dificultad;
    }

    public int dificultadSalidaExterna(int numeroFicheros, int numeroDatosElementales) {
        int dificultad = 0;
        if (numeroFicheros == 0 || numeroFicheros == 1) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 5) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 6 && numeroDatosElementales <= 19) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 20) {
                dificultad = 1;
            }
        } else if (numeroFicheros == 2 || numeroFicheros == 3) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 5) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 6 && numeroDatosElementales <= 19) {
                dificultad = 1;
            } else if (numeroDatosElementales >= 20) {
                dificultad = 2;
            }
        } else if (numeroFicheros >= 4) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 5) {
                dificultad = 1;
            } else if (numeroDatosElementales >= 6 && numeroDatosElementales <= 19) {
                dificultad = 2;
            } else if (numeroDatosElementales >= 20) {
                dificultad = 2;
            }
        }
        return dificultad;
    }

    public int dificultadGLDI(int numeroFicheros, int numeroDatosElementales) {
        int dificultad = 0;
        if (numeroFicheros == 1) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 19) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 20 && numeroDatosElementales <= 50) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 51) {
                dificultad = 1;
            }
        } else if (numeroFicheros == 2 || numeroFicheros == 5) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 19) {
                dificultad = 0;
            } else if (numeroDatosElementales >= 20 && numeroDatosElementales <= 50) {
                dificultad = 1;
            } else if (numeroDatosElementales >= 51) {
                dificultad = 2;
            }
        } else if (numeroFicheros >= 6) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 19) {
                dificultad = 1;
            } else if (numeroDatosElementales >= 20 && numeroDatosElementales <= 50) {
                dificultad = 2;
            } else if (numeroDatosElementales >= 51) {
                dificultad = 2;
            }
        }
        return dificultad;
    }
    
    
}
