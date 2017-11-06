/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Design Phone Directory
 * 
 * Design a Phone Directory which supports the following operations:
 * 
 * get: Provide a number which is not assigned to anyone.
 * check: Check if a number is available or not.
 * release: Recycle or release a number.
 * 
 * @author Johnny
 */
public class Solution379 {
    int max;
    HashSet<Integer> set;
    LinkedList<Integer> queue;
    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public Solution379(int maxNumbers) {
        set = new HashSet<Integer>();
        queue = new LinkedList<Integer>();
        for (int i = 0; i < maxNumbers; i++){
            queue.offer(i);
        }
        max = maxNumbers - 1;
    }
 
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        if(queue.isEmpty()) {
            return -1;
        }
 
        int e = queue.poll();
        set.add(e);
        return e;
    }
 
    /** Check if a number is available or not. */
    public boolean check(int number) {
        return !set.contains(number) && number <= max;
    }
 
    /** Recycle or release a number. */
    public void release(int number) {
        if(set.contains(number)){
            set.remove(number);
            queue.offer(number);
        }
    }
}
