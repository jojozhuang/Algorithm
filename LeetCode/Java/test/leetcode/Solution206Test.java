/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution206Test {
    
    public Solution206Test() {
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
     * Test of reverseList method, of class Solution206.
     */
    @Test
    public void testReverseList() {
        System.out.println("reverseList");
        Solution206 instance = new Solution206();

        assertEquals(null, instance.reverseList(null));
        
        //1->2->3->4->5
        ListNode head2 = ListNode.createInstance(new int[]{1,2,3,4,5});
        ListNode expect2 = ListNode.createInstance(new int[]{5,4,3,2,1});
        assertTrue(ListNode.isSame(expect2, instance.reverseList(head2)));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
