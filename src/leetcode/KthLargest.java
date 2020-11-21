package leetcode;

import java.util.Optional;
import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> priorityQueue;
    private int k;

    public KthLargest(int k,int [] nums) {
        this.k = k;
        this.priorityQueue = new PriorityQueue<>();
        for(int i: nums){
            priorityQueue.add(i);
            maintainKLenth();
        }
    }

    private void maintainKLenth() {
        if (priorityQueue.size() > k){
            priorityQueue.poll();
        }
    }

    public int add(int val){
        priorityQueue.add(val);
        maintainKLenth();
        return Optional.ofNullable(priorityQueue.peek()).orElse(-1);
    }
}
