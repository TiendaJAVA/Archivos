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
public class Descuentazo_algorit_01Test {
    
    public Descuentazo_algorit_01Test() {
    }

    /**
     * Test of main method, of class Descuentazo_algorit_01.
     */
    //@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Descuentazo_algorit_01.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagos method, of class Descuentazo_algorit_01.
     */
    @Test
    public void testPagos() {
        System.out.println("pagos");
        float num1 = 4.0F;
        int num2 = 1;
        float expResult = 4.0F;
        float result = Descuentazo_algorit_01.pagos(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
            if(expResult!=result)  fail("The test case is a prototype.");
    }

    /**
     * Test of descuento method, of class Descuentazo_algorit_01.
     */
    @Test
    public void testDescuento() {
        System.out.println("descuento");
        float numA = 50.0F;
        int numB = 50;
        float expResult = 25.0F;
        float result = Descuentazo_algorit_01.descuento(numA, numB);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
             if(expResult!=result) fail("The test case is a prototype.");
    }
    
}
