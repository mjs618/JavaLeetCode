package leetcode;

public class Fibonacci {
    public static int fib(int num){
        int fibNum = 0;
        if(num == 0){
            fibNum = 0;
        }
        if(num == 1){
            fibNum = 1;
        }
        if(num > 1){
            fibNum = fib(num -1) + fib(num -2);
        }
        return fibNum;
    }
    public static void main(String[] args) {
       System.out.println(fib(4));
    }
}
