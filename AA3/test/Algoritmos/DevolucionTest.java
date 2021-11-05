/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Algoritmos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aguil
 */
public class DevolucionTest {
    
    public DevolucionTest() {
    }

    /**
     * Test of main method, of class Devolucion.
     */
  //  @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Devolucion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagos method, of class Devolucion.
     */
    @Test
    public void testPagos() {
        System.out.println("pagos");
        float num1 = 10.0F;
        int num2 = 4;
        float expResult = 40.0F;
        float result = Devolucion.pagos(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
            if(expResult!=result)  fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Devolucion.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double num3 = 100.0;
        double num4 = 50.0;
        double expResult = 50.0;
        double result = Devolucion.resta(num3, num4);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
            if(expResult!=result)  fail("The test case is a prototype.");
    }
    
}
