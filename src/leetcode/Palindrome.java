package leetcode;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int tem = x;
        int rs = 0;
        while (x > 0) {
            rs *= 10;
            rs += x % 10;
            x /= 10;
        }
        if(tem == rs)
        {
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
