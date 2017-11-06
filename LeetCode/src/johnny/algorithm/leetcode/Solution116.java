/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeLinkNode;

/**
 * Populating Next Right Pointers in Each Node.
 * Given a binary tree
 * 
 *     struct TreeLinkNode {
 *       TreeLinkNode *left;
 *       TreeLinkNode *right;
 *       TreeLinkNode *next;
 *     }
 * Populate each next pointer to point to its next right node. If there is no 
 * next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * Note:
 * 
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree (ie, all leaves are at the 
 * same level, and every parent has two children).
 * 
 * For example,
 * Given the following perfect binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \  / \
 *     4  5  6  7
 * After calling your function, the tree should look like:
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \  / \
 *     4->5->6->7 -> NULL
 * 
 * @author Johnny
 */
public class Solution116 {
    public void connect(TreeLinkNode root) {
        if (root == null || root.left == null) {
            return;
        }
        
        //current level
        root.left.next = root.right;
        
        //silbing
        TreeLinkNode currentNode = root;
        TreeLinkNode nextNode = root.next;
        while (nextNode != null) {
            currentNode.right.next = nextNode.left;
            nextNode.left.next = nextNode.right;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        
        //next level
        connect(root.left);
    }
    
    public void connect2(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        
        TreeLinkNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                curr.left.next = curr.right;
            }
            if (curr.right != null) {
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
            }
            curr = curr.next;
        }
        
        connect(root.left);
    }
}