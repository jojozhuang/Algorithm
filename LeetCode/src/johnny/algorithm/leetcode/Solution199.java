/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;
import johnny.algorithm.leetcode.common.TreeNode;
import java.util.*;
/**
 * Binary Tree Right Side View.
 * Given a binary tree, imagine yourself standing on the right side of it, 
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * For example:
 * Given the following binary tree,
 *    1            ---
 *  /   \
 * 2     3         ---
 *  \     \
 *   5     4       ---
 * You should return [1, 3, 4].
 *  
 * @author Johnny
 * 
 */
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == size - 1) {
                    res.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        
        return res;
    }
    
    public List<Integer> rightSideView2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        
        List<Integer> left = rightSideView2(root.left);
        List<Integer> right = rightSideView2(root.right);
        
        res.add(root.val);
        if (right.size() > 0) {
            res.addAll(right);
        }
        
        if (left.size() > right.size()) {
            for(int i = right.size(); i < left.size(); i++) {
                res.add(left.get(i));
            }
        }
        
        return res;
    }    
}