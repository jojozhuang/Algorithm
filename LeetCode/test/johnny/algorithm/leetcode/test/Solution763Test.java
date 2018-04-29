package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution763;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution763Test {

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
        System.out.println("partitionLabels");
        Solution763 instance = new Solution763();

        List<Integer> result1 = ListUtil.buildList(new Integer[] {9,7,8});
        assertEquals(result1, instance.partitionLabels("ababcbacadefegdehijhklij"));
    }

}
