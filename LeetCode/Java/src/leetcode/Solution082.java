/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;

/**
 * Remove Duplicates from Sorted List II.
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * 
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * 
 * @author Johnny
 */
public class Solution082 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = dummy;        
        while(curr.next != null && curr.next.next != null) {
            if (curr.next.val == curr.next.next.val) {
                int pre_value = curr.next.val;
                while (curr.next != null && curr.next.val == pre_value) {
                    curr.next = curr.next.next;
                }
            }
            else {
                curr = curr.next;
            }
        }
        
        return dummy.next;
    }
}
