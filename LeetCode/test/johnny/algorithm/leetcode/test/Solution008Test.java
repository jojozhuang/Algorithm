/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution008;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution008Test {
    
    public Solution008Test() {
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
     * Test of atoi method, of class Solution008.
     */
    @Test
    public void testAtoi() {
        System.out.println("myAtoi");
        String str = "";
        Solution008 instance = new Solution008();
        int expResult = 0;
        int result = instance.myAtoi(str);
        assertEquals(expResult, result);
               
        assertEquals(123, instance.myAtoi("123"));
        assertEquals(2, instance.myAtoi("2"));
        assertEquals(0, instance.myAtoi("0"));
        assertEquals(-1, instance.myAtoi("-1"));       
        assertEquals(100, instance.myAtoi("100"));
        assertEquals(-900, instance.myAtoi("-900"));
        assertEquals(2147483647, instance.myAtoi("2147483647"));
        assertEquals(-2147483648, instance.myAtoi("-2147483648"));
        assertEquals(2147483647, instance.myAtoi("2147483648"));
        assertEquals(-2147483648, instance.myAtoi("-2147483649"));
        assertEquals(2147483647, instance.myAtoi("17412221212132343145345363847412"));
        assertEquals(-2147483648, instance.myAtoi("-18463847748498509509412"));
        assertEquals(10011000, instance.myAtoi("0010011000"));
        assertEquals(-23456, instance.myAtoi("-0023456"));
        assertEquals(0, instance.myAtoi("00000000"));
        assertEquals(0, instance.myAtoi("-00000000000000"));
        assertEquals(2147483647, instance.myAtoi("002147483647"));
        assertEquals(-2147483648, instance.myAtoi("-0002147483648"));
        assertEquals(2147483647, instance.myAtoi("002147483648"));
        assertEquals(-2147483648, instance.myAtoi("-0002147483649"));
        assertEquals(1, instance.myAtoi("1+"));
        assertEquals(1, instance.myAtoi("+1"));
        assertEquals(1, instance.myAtoi("1-"));
        assertEquals(0, instance.myAtoi("+-2"));
        assertEquals(10, instance.myAtoi("    010"));
        assertEquals(-9900, instance.myAtoi("    -00009900"));
        assertEquals(-134900, instance.myAtoi("-000134900   "));
        assertEquals(0, instance.myAtoi("-  00045657   "));
        assertEquals(-12, instance.myAtoi("  -0012a42"));
        assertEquals(0, instance.myAtoi("sdfsd  -0012a42"));
        assertEquals(0, instance.myAtoi("00-0012a42"));
        assertEquals(89, instance.myAtoi("089-0012a42"));
        assertEquals(-2147483647, instance.myAtoi("-2147483647"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}