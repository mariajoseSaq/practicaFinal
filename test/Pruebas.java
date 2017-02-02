/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Controlador.Controlador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maria Jose
 */
public class Pruebas {
    
    public Pruebas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    
    @Test
    public void testEE()
    {
     int numFicher=2;
     int numDatosEle=6;
     Controlador pr= new Controlador();
     String resultEsperado="Medio";
     String rdo=pr.dificultadEntradaExterna(numFicher, numDatosEle);
        assertEquals(resultEsperado, rdo);
    }
    
    @Test
    public void testSE()
    {
     int numFicher=1;
     int numDatosEle=4;
     Controlador pr= new Controlador();
     String resultEsperado="Sencillo";
     String rdo=pr.dificultadSalidaExterna(numFicher, numDatosEle);
        assertEquals(resultEsperado, rdo);
    }
    
      @Test
    public void testGLDI()
    {
     int numFicher=7;
     int numDatosEle=52;
     Controlador pr= new Controlador();
     String resultEsperado="Complejo";
     String rdo=pr.dificultadEntradaExterna(numFicher, numDatosEle);
        assertEquals(resultEsperado, rdo);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
