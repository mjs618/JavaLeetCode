package fundamentaljava;

import java.util.List;

public class LinkedListTester {
    static class ListNode{
        int val;
        ListNode next;
        ListNode pre;
        ListNode(int x){val = x;};
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(0);
        ListNode n0 = new ListNode(3);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(7);

        n.next = n0;
        n0.next = n1;
        n1.next = n2;
        n2.pre = n1;
        n1.pre = n0;
        n0.pre = n;
        System.out.println("n2 : " + n1.next.val);
        System.out.println("n : " + n0.pre.val);



    }
}
