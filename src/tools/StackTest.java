package tools;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        int[] intArr = new int[]{1,2,3,4};
        int[] intArr2 = new int[]{1,2,3,4};
        String[] s = new String[]{"zhang","li"};
        Stack stack = new Stack();
        stack.push(intArr);
        stack.push(s);

        int[] one= (int[])stack.get(0);

        String[] strings = (String[]) stack.get(1);
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(stack.size());
        }


    }
}
