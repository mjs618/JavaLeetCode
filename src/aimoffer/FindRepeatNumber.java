package aimoffer;

public class FindRepeatNumber {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false

/**
 * 通过HashSet 数据元素不能重复的方法来找出重复的第一个数据
    public  int findRepeatNumber(int[] nums) {
        int rst = -1;

        Set<Integer> set = new HashSet<>();

        if(nums == null){
            return rst;
        }else{
            for (int num: nums) {
                if (!set.add(num)){
                    rst = num;
                    break;
                }

            }
        }
        return rst;
    }
 **/

    public static int findRepeatNumber(int[] nums){
        int n = nums.length;
        for(int num: nums){
            if (num < 0 || num >= n){
                return -1;
        }
            for (int i = 0; i < n; i++) {
                while (nums[i] != i && nums[nums[i]] != nums[i]){
                    swap(nums,i,nums[i]);

                }
                if (nums[i] != i && nums[nums[i]] == nums[i] ){
                    return nums[i];
                }
            }

    }
        return -1;
    }

    private static void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3};
        //int[] nums = {2,3,1,0,2,5,3};
        //int[] nums = {1,1,2,3,1,2};

        System.out.println(findRepeatNumber(nums));
    }
}
