package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution345;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution345Test {
    
    public Solution345Test() {
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
     * Test of reverseVowels method, of class Solution345.
     */
    @Test
    public void testReverseVowels() {
        System.out.println("reverseVowels");
        String s = "";
        Solution345 instance = new Solution345();
        String expResult = "";
        String result = instance.reverseVowels(s);
        assertEquals(expResult, result);
        
        assertEquals("holle", instance.reverseVowels("hello"));
        assertEquals("leotcede", instance.reverseVowels("leetcode"));
        assertEquals("a.b,.", instance.reverseVowels("a.b,."));
    }
}
