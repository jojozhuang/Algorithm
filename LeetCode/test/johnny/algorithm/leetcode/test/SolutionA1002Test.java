package johnny.algorithm.leetcode.test;

import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1002;
import johnny.algorithm.leetcode.common.ListUtil;

public class SolutionA1002Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("commonChars");
        SolutionA1002 instance = new SolutionA1002();

        List<String> expect1 = ListUtil.buildList(new String[] {"e","l","l"});
        List<String> result1 = instance.commonChars(new String[] {"bella","label","roller"});
        assertEquals(expect1, result1);
    }
}