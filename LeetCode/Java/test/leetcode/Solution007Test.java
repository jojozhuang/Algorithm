/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution007Test {
    
    public Solution007Test() {
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
     * Test of reverse method, of class Solution007.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        int x = 0;
        Solution007 instance = new Solution007();
        int expResult = 0;
        int result = instance.reverse(x);
        assertEquals(expResult, result);
        
        assertEquals(321, instance.reverse(123));
        assertEquals(2, instance.reverse(2));
        assertEquals(0, instance.reverse(0));
        assertEquals(-1, instance.reverse(-1));       
        assertEquals(1, instance.reverse(100));
        assertEquals(-9, instance.reverse(-900));
        assertEquals(-6007488, instance.reverse(-8847006));
        assertEquals(0, instance.reverse(2147483647));
        assertEquals(2143847412, instance.reverse(2147483412));
        assertEquals(0, instance.reverse(-2147483648));
        assertEquals(-2143847412, instance.reverse(-2147483412));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
