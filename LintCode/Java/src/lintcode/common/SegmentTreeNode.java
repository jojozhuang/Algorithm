/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode.common;

/**
 *
 * @author i857285
 */
public class SegmentTreeNode {
    public int start, end;
    public int max, min, sum; // You can add other additional attributes
    public SegmentTreeNode left, right;
    
    public SegmentTreeNode(int start, int end) {
        this.start = start;
        this.end = end;
        this.left = null;
        this.right = null;
    }
}
