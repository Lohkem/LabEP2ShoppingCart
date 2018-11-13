/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Olivier
 */

@RunWith(Parameterized.class)
public class ParamShoppingCartTest {
    double precio1;
    double precio2;
            
    public ParamShoppingCartTest(double pr1, double pr2) {
        
        precio1 = pr1;
        precio2 = pr2;        
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

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in differentProducts() method
	
   @Parameterized.Parameters
   public static Collection differentProducts() {
      return Arrays.asList(new Object[][] {
         { 1250, 2500 },
         { 35, 20 },
         { 3.9, 1.5 },
         { 12, 4.3 },
         { 24, 25 }
      });
   }
    
     /**
     * Test of getBalance method, of class ShoppingCart.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Product p1 = new Product("phone", precio1);
        Product p2 = new Product("computer", precio2);
        Product p3 = new Product("drink", precio1 + precio2);
        ShoppingCart instance = new ShoppingCart();
        double result = instance.getBalance();
        assertEquals(0.0, result, 0.0);
        instance.addItem(p1);
        instance.addItem(p2);
        instance.addItem(p3);
        double expResult = 2*(precio1 + precio2);
        result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        /*fail("The test case is a prototype.");*/
    }

    /**
     * Test of addItem method, of class ShoppingCart.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Product p = null;
        ShoppingCart instance = new ShoppingCart();
        assertEquals(instance.getItemCount(), 0);
        instance.addItem(p);
        assertEquals(instance.getItemCount(), 1);
        // TODO review the generated test code and remove the default call to fail.
        /*fail("The test case is a prototype.");*/
    }

    /**
     * Test of removeItem method, of class ShoppingCart.
     */
    @Test
    public void testRemoveItem() throws Exception {
        /*System.out.println("removeItem");
        Product p = null;
        ShoppingCart instance = new ShoppingCart();
        instance.removeItem(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of getItemCount method, of class ShoppingCart.
     */
    @Test
    public void testGetItemCount() {
        /*System.out.println("getItemCount");
        ShoppingCart instance = new ShoppingCart();
        int expResult = 0;
        int result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of empty method, of class ShoppingCart.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        ShoppingCart instance = new ShoppingCart();
        /*instance.empty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        Product p = null;
        assertTrue(instance.isEmpty());
        instance.addItem(p);
        assertFalse(instance.isEmpty());
        instance.empty();
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of isEmpty method, of class ShoppingCart.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ShoppingCart instance = new ShoppingCart();
        /*boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        Product p = null;
        assertTrue(instance.isEmpty());
        instance.addItem(p);
        assertFalse(instance.isEmpty());
    }

    /**
     * Test of imprimeFactura method, of class ShoppingCart.
     */
    @Test
    public void testImprimeFactura() throws Exception {
        /*System.out.println("imprimeFactura");
        Writer writer = null;
        ShoppingCart instance = new ShoppingCart();
        instance.imprimeFactura(writer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of findProduct method, of class ShoppingCart.
     */
    @Test
    public void testFindProduct() {
        System.out.println("findProduct");
        Product p = new Product("phone", precio1);
        ShoppingCart instance = new ShoppingCart();
        instance.addItem(p);
        assertFalse(instance.findProduct("car"));
        assertTrue(instance.findProduct("phone"));
        /*// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    /**
     * Test of addItemFindProduct
     */
    @Test
    public void testAddItemFindProduct() {
        System.out.println("addItemfindProduct");
        Product p = new Product("phone", precio1);
        ShoppingCart instance = new ShoppingCart();
        assertFalse(instance.findProduct("phone"));
        instance.addItem(p);
        assertTrue(instance.findProduct("phone"));
    }
}
