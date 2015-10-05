/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Factorial Trailing Zeroes.
 * Given an integer n, return the number of trailing zeroes in n!.
 * 
 * Note: Your solution should be in logarithmic time complexity.
 * //http://www.purplemath.com/modules/factzero.htm
 * 
 * @author Johnny
 */
public class Solution172 {
    public int trailingZeroes(int n) {
        if (n<=0)
            return 0;

        int ret = 0;
        int exponent = 1;
        double quotient = 1;
        while(quotient>=1) {
            quotient = n/Math.pow(5, exponent);
            ret = ret+(int)Math.floor(quotient);
            exponent++;
        }
        
        return ret;
    }   
    
}
