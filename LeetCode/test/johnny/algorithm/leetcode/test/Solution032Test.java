package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution032;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution032Test {
    
    public Solution032Test() {
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
     * Test of longestValidParentheses method, of class Solution032.
     */
    @Test
    public void testLongestValidParentheses() {
        System.out.println("longestValidParentheses");
        String s = "";
        Solution032 instance = new Solution032();
        int expResult = 0;
        int result = instance.longestValidParentheses(s);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.longestValidParentheses("(()"));
        assertEquals(4, instance.longestValidParentheses(")()())"));
        assertEquals(2, instance.longestValidParentheses("()(()"));
    }
}
