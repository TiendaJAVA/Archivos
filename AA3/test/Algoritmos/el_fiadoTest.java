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
public class el_fiadoTest {
    
    public el_fiadoTest() {
    }

    /**
     * Test of main method, of class el_fiado.
     */
   // @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        el_fiado.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cuotaS method, of class el_fiado.
     */
    @Test
    public void testCuotaS() {
        System.out.println("cuotaS");
        double num1 = 50.0;
        float num2 = 100.0F;
        double expResult = 0.5;
        double result = el_fiado.cuotaS(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
           if(expResult!=result)   fail("The test case is a prototype.");
    }
    
}
