public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;

        while (x != 0)
        {

            // a%b = a - (a/b)*b 取模公式

            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println((6/4));
      System.out.println(reverse(123056));
    }

}
