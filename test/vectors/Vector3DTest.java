/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patrycja
 */
public class Vector3DTest {
    
    public Vector3DTest() {
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
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(0,0,5);
        double expResult = 5.0;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(4,5,6);
        Vector3D expResult = new Vector3D(5,7,9);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 2.0;
        Vector3D instance = new Vector3D(1,2,3);
        Vector3D expResult = new Vector3D(2,4,6);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(4,5,6);
        double expResult = 4+10+18;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(1,8,9);
        Vector3D instance = new Vector3D(4,5,6);
        Vector3D expResult = new Vector3D(-(8*6-9*5),(1*6-9*4),-(1*5-8*4));
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(1,2,3);
        String expResult = "[1.0, 2.0, 3.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(5,6,7);
        Vector3D instance = new Vector3D(5,6,7);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
