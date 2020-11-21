package leetcode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        if(nums == null || nums.length < 2){
            return new int[] {-1,-1};
        }
        int[] res = new int[]{-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                break;

            }
            map.put(nums[i],i);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] res = new int[]{1,3,5,7};
        int[] tem = twoSum(res,6);
        for (int i = 0; i < tem.length ; i++) {
            System.out.println(tem[i]);
        }
    }
}
