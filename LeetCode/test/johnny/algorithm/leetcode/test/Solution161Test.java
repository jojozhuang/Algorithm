package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution161;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution161Test {
    
    public Solution161Test() {
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
     * Test of isOneEditDistance method, of class Solution161.
     */
    @Test
    public void testIsOneEditDistance() {
        System.out.println("isOneEditDistance");
        Solution161 instance = new Solution161();

        assertEquals(false, instance.isOneEditDistance("", ""));

        assertEquals(true, instance.isOneEditDistance("", "a"));
        assertEquals(true, instance.isOneEditDistance("a", ""));
        assertEquals(true, instance.isOneEditDistance("b", "a"));
        assertEquals(false, instance.isOneEditDistance("a", "a"));
        assertEquals(false, instance.isOneEditDistance("", "ab"));
        assertEquals(true, instance.isOneEditDistance("abc", "abcd"));
        assertEquals(true, instance.isOneEditDistance("aab", "acb"));
        assertEquals(false, instance.isOneEditDistance("abcd", "abbb"));
        assertEquals(false, instance.isOneEditDistance("ac", "abcde"));
    }
}
