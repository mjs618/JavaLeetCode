package leetcode;

import datastructure.linkedlist.LinkedNode;
import org.w3c.dom.stylesheets.LinkStyle;

public class PlusOneLinkedList {
    private static class ListNode{
        int val;
        ListNode next;
        public ListNode(int x) {
            val = x;
        }
    }

    private static ListNode plusOne(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next =head;

        ListNode i = dummy;
        ListNode j = dummy;

        while (j.next != null){
            j = j.next;
            if(j.val == 9){
                i = j;
            }
        }
        if(j.val != 9){
            j.val++;
        }else {
            i.val++;
            i = i.next;
            while (i != null){
                i.val = 0;
                i = i.next;
            }
        }
        if (dummy.val == 0){
            return dummy.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(10909);
        ListNode rst =  plusOne(listNode);

        System.out.println(rst.val);
    }
}
