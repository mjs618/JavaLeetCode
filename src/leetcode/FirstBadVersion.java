package leetcode;

public class FirstBadVersion {
    private static int FIRST_BAD = 4;
    private static boolean isBadVersion(int version){
        if (version >= FIRST_BAD){
            return true;
        }
        return false;
    }

    private static int firstBadVersion(int n){
        int low = 1;
        int high = n;
        while(low < high){
            int mid = low + (high - low) /2;
            if (isBadVersion(mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int rst = firstBadVersion(10);
        System.out.println(rst);

    }
}
