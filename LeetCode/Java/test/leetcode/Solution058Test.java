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
public class Solution058Test {
    
    public Solution058Test() {
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
     * Test of lengthOfLastWord method, of class Solution058.
     */
    @Test
    public void testLengthOfLastWord() {
        System.out.println("lengthOfLastWord");
        String s = "";
        Solution058 instance = new Solution058();
        int expResult = 0;
        int result = instance.lengthOfLastWord(s);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.lengthOfLastWord("a"));
        assertEquals(1, instance.lengthOfLastWord("a "));
        assertEquals(2, instance.lengthOfLastWord("teach me "));
        assertEquals(3, instance.lengthOfLastWord(" abc"));
        assertEquals(5, instance.lengthOfLastWord("Hello World"));
        assertEquals(6, instance.lengthOfLastWord("133 Hello Kitty!"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of lengthOfLastWord2 method, of class Solution058.
     */
    @Test
    public void testLengthOfLastWord2() {
        System.out.println("lengthOfLastWord2");
        String s = "";
        Solution058 instance = new Solution058();
        int expResult = 0;
        int result = instance.lengthOfLastWord2(s);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.lengthOfLastWord2("a"));
        assertEquals(1, instance.lengthOfLastWord2("a "));
        assertEquals(2, instance.lengthOfLastWord2("teach me "));
        assertEquals(3, instance.lengthOfLastWord2(" abc"));
        assertEquals(5, instance.lengthOfLastWord2("Hello World"));
        assertEquals(6, instance.lengthOfLastWord2("133 Hello Kitty!"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of lengthOfLastWord3 method, of class Solution058.
     */
    @Test
    public void testLengthOfLastWord3() {
        System.out.println("lengthOfLastWord3");
        String s = "";
        Solution058 instance = new Solution058();
        int expResult = 0;
        int result = instance.lengthOfLastWord3(s);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.lengthOfLastWord3("a"));
        assertEquals(1, instance.lengthOfLastWord3("a "));
        assertEquals(2, instance.lengthOfLastWord3("teach me "));
        assertEquals(3, instance.lengthOfLastWord3(" abc"));
        assertEquals(5, instance.lengthOfLastWord3("Hello World"));
        assertEquals(6, instance.lengthOfLastWord3("133 Hello Kitty!"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
