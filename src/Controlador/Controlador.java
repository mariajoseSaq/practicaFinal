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

    public String dificultadEntradaExterna(int numeroFicheros, int numeroDatosElementales) {
        String dificultad = "";
        if (numeroFicheros <= 1) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 4) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 5 && numeroDatosElementales <= 15) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 16) {
                dificultad = "Medio";
            }
        } else if (numeroFicheros == 2) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 4) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 5 && numeroDatosElementales <= 15) {
                dificultad = "Medio";
            } else if (numeroDatosElementales >= 16) {
                dificultad = "Complejo";
            }
        } else if (numeroFicheros >= 3) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 4) {
                dificultad = "Medio";
            } else if (numeroDatosElementales >= 5 && numeroDatosElementales <= 15) {
                dificultad = "Complejo";
            } else if (numeroDatosElementales >= 16) {
                dificultad = "Complejo";
            }
        }
        return dificultad;
    }

    public String dificultadSalidaExterna(int numeroFicheros, int numeroDatosElementales) {
        String dificultad = "";
        if (numeroFicheros == 0 || numeroFicheros == 1) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 5) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 6 && numeroDatosElementales <= 19) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 20) {
                dificultad = "Medio";
            }
        } else if (numeroFicheros == 2 || numeroFicheros == 3) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 5) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 6 && numeroDatosElementales <= 19) {
                dificultad = "Medio";
            } else if (numeroDatosElementales >= 20) {
                dificultad = "Complejo";
            }
        } else if (numeroFicheros >= 4) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 5) {
                dificultad = "Medio";
            } else if (numeroDatosElementales >= 6 && numeroDatosElementales <= 19) {
                dificultad = "Complejo";
            } else if (numeroDatosElementales >= 20) {
                dificultad = "Complejo";
            }
        }
        return dificultad;
    }

    public String dificultadGLDI(int numeroFicheros, int numeroDatosElementales) {
        String dificultad = "";
        if (numeroFicheros == 1) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 19) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 20 && numeroDatosElementales <= 50) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 51) {
                dificultad = "Medio";
            }
        } else if (numeroFicheros == 2 || numeroFicheros == 5) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 19) {
                dificultad = "Sencillo";
            } else if (numeroDatosElementales >= 20 && numeroDatosElementales <= 50) {
                dificultad = "Medio";
            } else if (numeroDatosElementales >= 51) {
                dificultad = "Complejo";
            }
        } else if (numeroFicheros >= 6) {
            if (numeroDatosElementales >= 1 && numeroDatosElementales <= 19) {
                dificultad = "Medio";
            } else if (numeroDatosElementales >= 20 && numeroDatosElementales <= 50) {
                dificultad = "Complejo";
            } else if (numeroDatosElementales >= 51) {
                dificultad = "Complejo";
            }
        }
        return dificultad;
    }

    public String dificultadConsultaExterna(int numeroFicherosEntrada, int numeroDatosElementalesEntrada, int numeroFicherosSalida, int numeroDatosElementalesSalida) {
        String entrada = dificultadEntradaExterna(numeroFicherosEntrada, numeroDatosElementalesEntrada);
        String salida = dificultadSalidaExterna(numeroFicherosSalida, numeroDatosElementalesSalida);
        int sal, ent;
        if ("Sencillo".equals(salida)) {
            sal = 0;
        } else if ("Medio".equals(salida)) {
            sal = 1;
        } else {
            sal = 2;
        }

        if ("Sencillo".equals(entrada)) {
            ent = 0;
        } else if ("Medio".equals(entrada)) {
            ent = 1;
        } else {
            ent = 2;
        }

        if (ent <= sal) {
            return salida;
        } else {
            return entrada;
        }
    }

    public void actualizaPFNA(int valor) {
        pr.setPFNA(valor);
    }

}
