package leetcode;

import java.util.ArrayList;
import java.util.List;

public class QuestionMissingRanges {
    private static List<String> findMissingRanges(int[] num,int lower,int upper){
        //Step 1: Define return value
        List<String> ret = new ArrayList<>();
        //Step 2: handle corner case
        if(num ==null || num.length == 0){
            return ret;
        }
        // Setp 3: Fill in business logic
        addToList(ret,lower,num[0]-1);
        int prev = num[0];
        int i = 1;
        while (i< num.length){
            int cur = num[i];
            if (cur != prev + 1){
                addToList(ret,prev+1,cur -1);
            }
            prev = cur;
            i++;
        }

        addToList(ret,num[num.length -1] +1,upper);
        return ret;
    }

    private static void addToList(List<String> ret, int start, int end) {
        if (start == end){
            ret.add(String.valueOf(start));
        }else if(start < end){
            ret.add(start+"-->"+ end);
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;
        List<String> ret = findMissingRanges(nums,lower,upper);
        System.out.println(ret.toString());

    }
}
