package aimoffer;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(0));
    }

    public int fib(int n){
         
        //定义一个常量用于取模
        int constant = 1000000007;


        int first = 0,second = 1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = (first + second) % constant;
            first = second;
            second = res;

        }
        return first;
    }
}
