public class RomanToInt {
    public static int romanToInt(String s) {
        String[] roman = {"IV", "IX", "XL", "XC", "CD", "CM", "I", "V", "X", "L", "C", "D", "M"};
        int[] nums = {4, 9, 40, 90, 400, 900, 1, 5, 10, 50, 100, 500, 1000};
        int num = 0;
        while (s.length() > 0) {
            for (int i = 0; i < roman.length; i++) {
                if (s.startsWith(roman[i])) {
                    num += nums[i];
                    s = s.substring(roman[i].length());
                    break;
                }
            }
        }
        return num;

    }

    public static void main(String[] args) {
       System.out.println(romanToInt("II"));
    }
}
