package tools;

public class Test {
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        int res = min(5,6);
        System.out.println(res);
    }
}
