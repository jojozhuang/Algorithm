package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution581;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution581Test {
    
    public Solution581Test() {
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
     * Test of findUnsortedSubarray method, of class Solution581.
     */
    @Test
    public void testFindUnsortedSubarray() {
        System.out.println("findUnsortedSubarray");
        Solution581 instance = new Solution581();

        assertEquals(0, instance.findUnsortedSubarray(new int[]{}));
        assertEquals(0, instance.findUnsortedSubarray(new int[]{1}));
        assertEquals(0, instance.findUnsortedSubarray(new int[]{1,2}));
        assertEquals(2, instance.findUnsortedSubarray(new int[]{2,1}));
        assertEquals(5, instance.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
}
