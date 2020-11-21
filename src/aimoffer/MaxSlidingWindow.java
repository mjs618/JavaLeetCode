package aimoffer;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};

        int[] res = maxSlidingWindow(nums,3);
        for(int re : res){
            System.out.println(re);
        }

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            // 删除 deque 中对应的 nums[i-1]
            if(i > 0 && deque.peekFirst() == nums[i - 1]) {
                deque.removeFirst();
            }
            // 保持 deque 递减
            while(!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            // 记录窗口最大值
            if(i >= 0) {
                res[i] = deque.peekFirst();
            }
        }
        return res;
    }


}
