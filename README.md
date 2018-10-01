
package proyectoayudantia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MetodosTest {
    
    public MetodosTest() {
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
    public void testLanzarDados() {
        System.out.println("lanzarDados");
        int result = Metodos.lanzarDados();
        if(result>=2 && result<=12){
            System.out.println("Funciona");
        }
        
    }
    
    @Test
    public void TestVida(){
        
        int[] saludjugadores = {2,5,4,6};
        int indiceJugador=1;
        Metodos.casillaSalud(indiceJugador, saludjugadores);
        if(saludjugadores[indiceJugador]<=15 &&saludjugadores[indiceJugador]>0 ){
            System.out.println("Correcto");
            
        }
        
        
    }
    @Test
    public void testPortal(){
        
    }
    
       
}
