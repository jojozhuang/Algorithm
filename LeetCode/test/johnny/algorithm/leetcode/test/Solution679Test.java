package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution679;

public class Solution679Test {

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
        System.out.println("judgePoint24");
        Solution679 instance = new Solution679();

        assertEquals(true, instance.judgePoint24(new int[] {4, 1, 8, 7}));
        //assertEquals(true, instance.judgePoint24(new int[] {1, 2, 1, 2}));
    }

}