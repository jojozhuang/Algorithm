/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.HashMap;

/**
 * Pow(x, n).
 * Implement pow(x, n).
 * 
 * @author Johnny
 */
public class Solution050 {
    //http://www.programcreek.com/2012/12/leetcode-powx-n/
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / helper(x, -n);
        } else {
            return helper(x, n);
        }
    }
    
    private double helper(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        
        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}