package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution455;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution455Test {

    public Solution455Test() {
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
     * Test of minMoves method, of class Solution453.
     */
    @Test
    public void testMinMoves() {
        System.out.println("minMoves");
        Solution455 instance = new Solution455();
        assertEquals(0, instance.minMoves(new int[]{}));
        assertEquals(0, instance.minMoves(new int[]{1}));
        assertEquals(0, instance.minMoves(new int[]{1,1}));
        assertEquals(1, instance.minMoves(new int[]{1,2}));
        assertEquals(2, instance.minMoves(new int[]{-1,1}));
        assertEquals(Integer.MAX_VALUE - 1, instance.minMoves(new int[]{1, Integer.MAX_VALUE}));
        assertEquals(-1 - Integer.MIN_VALUE, instance.minMoves(new int[]{Integer.MIN_VALUE, -1}));
        assertEquals(3, instance.minMoves(new int[]{1,2,3}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
