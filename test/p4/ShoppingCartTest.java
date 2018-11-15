/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.io.Writer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lokem
 */
public class ShoppingCartTest {
    
    public ShoppingCartTest() {
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

    /**
     * Test of getBalance method, of class ShoppingCart.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Product p1 = new Product("phone", 360);
        Product p2 = new Product("computer", 1000);
        Product p3 = new Product("drink", 1.5);
        ShoppingCart instance = new ShoppingCart();
        double result = instance.getBalance();
        assertEquals(0.0, result, 0.0);
        instance.addItem(p1);
        instance.addItem(p2);
        instance.addItem(p3);
        double expResult = 1361.5;
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
        System.out.println("removeItem");
        Product p = null;
        ShoppingCart instance = new ShoppingCart();
        try{
            instance.addItem(p);
            instance.removeItem(p);
        }catch(ProductNotFoundException e){
            fail("El metodo testRemove no funciona correctamente.");
        }
                  
    }

    /**
     * Test of getItemCount method, of class ShoppingCart.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        ShoppingCart instance = new ShoppingCart();
        int expResult = 0;
        int result = instance.getItemCount();
        assertEquals(expResult, result);
        
        for(int i = 0; i < 3; i++)
        {
            Product p = null;
            instance.addItem(p);
            expResult += 1;
        }
        result = instance.getItemCount();
        
        if(expResult != result)
            fail("Metodo getItemCount no esta funcionando correctamente");
    }

    /**
     * Test of empty method, of class ShoppingCart.
     */
    @Test
    public void testEmpty() {
        /*System.out.println("empty");
        ShoppingCart instance = new ShoppingCart();
        instance.empty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of isEmpty method, of class ShoppingCart.
     */
    @Test
    public void testIsEmpty() {
        /*System.out.println("isEmpty");
        ShoppingCart instance = new ShoppingCart();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
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
        /*System.out.println("findProduct");
        String title = "";
        ShoppingCart instance = new ShoppingCart();
        boolean expResult = false;
        boolean result = instance.findProduct(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    /**
     * Test of findProduct
     */
    @Test
    public void testAddItemFindProduct() {
        System.out.println("addItemfindProduct");
        Product p = new Product("phone", 360);
        ShoppingCart instance = new ShoppingCart();
        assertFalse(instance.findProduct("phone"));
        instance.addItem(p);
        assertTrue(instance.findProduct("phone"));
    }
    
    @Test
    public void testRemoveItem2() throws Exception {
        System.out.println("removeItem2");
        Product p = null;
        ShoppingCart instance = new ShoppingCart();
        try{
            instance.addItem(p);
            instance.removeItem(p);
        }catch(ProductNotFoundException e){
            fail("El metodo testRemove no funciona correctamente.");
        }
        assertTrue(instance.isEmpty());
    }
    
    @Test
    public void testRemoveItemCarroVacio() throws Exception {
        System.out.println("removeItemCarroVacio");
        Product p = null;
        ShoppingCart instance = new ShoppingCart();
        try{
            instance.removeItem(p);
            fail("no salto la excepcion");
        }catch(ProductNotFoundException e){
        }
    }
    
    @Test
    public void testShoppingCart() {
        System.out.println("Constructor ShoppingCart");
        ShoppingCart instance = new ShoppingCart();
        assertTrue(instance.isEmpty());
        assertEquals(instance.getItemCount(), 0);
    }
}
