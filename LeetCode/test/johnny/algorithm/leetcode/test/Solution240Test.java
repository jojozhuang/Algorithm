/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution240;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution240Test {
    
    public Solution240Test() {
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
     * Test of searchMatrix method, of class Solution240.
     */
    @Test
    public void testSearchMatrix() {
        System.out.println("searchMatrix");
        int[][] matrix = null;
        int target = 0;
        Solution240 instance = new Solution240();
        boolean expResult = false;
        boolean result = instance.searchMatrix(matrix, target);
        assertEquals(expResult, result);
        
        int[][] matrix1 = new int[][] { new int[] {1} };
        assertEquals(false, instance.searchMatrix(matrix1, 0));
        assertEquals(true, instance.searchMatrix(matrix1, 1));
        
        int[][] matrix2 = new int[][] { new int[] {1, 2}, new int[] {2, 3} };
        assertEquals(false, instance.searchMatrix(matrix2, 0));
        assertEquals(true, instance.searchMatrix(matrix2, 2));
        assertEquals(true, instance.searchMatrix(matrix2, 3));
        assertEquals(false, instance.searchMatrix(matrix2, 4));
        
        int[][] matrix3 = new int[][] { new int[] {1, 4, 7, 11, 15}, 
                                        new int[] {2, 5, 8, 12, 19},
                                        new int[] {3, 6, 9, 16, 22},
                                        new int[] {10, 13, 14, 17, 24},
                                        new int[] {18, 21, 23, 26, 30}};
        assertEquals(false, instance.searchMatrix(matrix3, 0));
        assertEquals(true, instance.searchMatrix(matrix3, 2));
        assertEquals(true, instance.searchMatrix(matrix3, 3));        
        assertEquals(true, instance.searchMatrix(matrix3, 11));
        assertEquals(false, instance.searchMatrix(matrix3, 20));
        assertEquals(true, instance.searchMatrix(matrix3, 22));
        assertEquals(true, instance.searchMatrix(matrix3, 30));
        assertEquals(false, instance.searchMatrix(matrix3, 31));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}