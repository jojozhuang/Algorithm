/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle.
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5, * 
 * Return
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * 
 * @author Johnny
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows<=0)
            return new ArrayList();
        
        List<List<Integer>> listpath = new ArrayList();
        List<Integer> list = new ArrayList();

        for (int i = 1; i<=numRows; i++) {
            list = new ArrayList();
            if (i==1) {
                list.add(1);
            }
            else if(i==2) {
                list.add(1);
                list.add(1);
            }
            else {
                list.add(1);
                List<Integer> previous = listpath.get(i-2);
                for(int j=0; j<previous.size()-1;j++) {
                    list.add((previous.get(j) + previous.get(j+1)));
                }
                list.add(1);
            }
            listpath.add(list);
        }
        
        return listpath;
    }
}
