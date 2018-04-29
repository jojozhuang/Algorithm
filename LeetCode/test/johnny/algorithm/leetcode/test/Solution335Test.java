package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution335;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution335Test {
    
    public Solution335Test() {
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
     * Test of isSelfCrossing method, of class Solution335.
     */
    @Test
    public void testIsSelfCrossing() {
        System.out.println("isSelfCrossing");
        int[] x = null;
        Solution335 instance = new Solution335();
        boolean expResult = false;
        boolean result = instance.isSelfCrossing(x);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isSelfCrossing(new int[]{2, 1, 1, 2}));
        assertEquals(false, instance.isSelfCrossing(new int[]{1, 2, 3, 4}));
        assertEquals(true, instance.isSelfCrossing(new int[]{1,1,1,1}));
    }
}
