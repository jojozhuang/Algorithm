package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution743;

public class Solution743Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("networkDelayTime");
        Solution743 instance = new Solution743();

        int[][] times1 = {{1,2,1}};
        assertEquals(-1, instance.networkDelayTime(times1, 2, 2));

        int[][] times2 = {{2,1,1},{2,3,1},{3,4,1}};
        assertEquals(2, instance.networkDelayTime(times2, 4, 2));

    }

}