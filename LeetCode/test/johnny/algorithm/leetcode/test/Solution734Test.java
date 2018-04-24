package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution734;

public class Solution734Test {

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
        System.out.println("areSentencesSimilar");
        Solution734 instance = new Solution734();

        String[] words11 = new String[] {"great", "acting", "skills"};
        String[] words12 = new String[] {"fine", "drama", "talent"};
        String[][] pairs1 = new String[][] {{"great", "fine"}, {"acting","drama"}, {"skills","talent"}};
        assertEquals(true, instance.areSentencesSimilar(words11,words12,pairs1));

        String[] words21 = new String[] {"great"};
        String[] words22 = new String[] {"great"};
        String[][] pairs2 = new String[][] {{}};
        assertEquals(true, instance.areSentencesSimilar(words21,words22,pairs2));
        
        String[] words31 = new String[] {"great"};
        String[] words32 = new String[] {"doubleplus","good"};
        String[][] pairs3 = new String[][] {{"great", "doubleplus"}, {"great","good"}, {"skills","talent"}};
        assertEquals(false, instance.areSentencesSimilar(words31,words32,pairs3));
    }

}
