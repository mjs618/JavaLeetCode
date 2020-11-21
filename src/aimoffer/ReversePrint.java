package aimoffer;

public class ReversePrint {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int x) {
           val = x;
        }
    }

    private int[] reversePrint(ListNode head){
        ListNode temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        int[] res = new int[size];
        temp = head;
        for (int i = size -1; i >=  0; i--) {
            res[i] = temp.val;
            temp = temp.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ReversePrint reversePrint = new ReversePrint();
        ListNode nums = new ListNode(1) ;
        nums.val = 1;
        nums.val = 2;
        System.out.println(reversePrint.reversePrint(nums));
    }
}
