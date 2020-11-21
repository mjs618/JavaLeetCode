package datastructure;

import datastructure.linkedstack.LinkedStack;
import datastructure.stack.SequentialStack;
import datastructure.stack.StackInterface;

public class StackTester {
    public static void main(String[] args) {
        //StackInterface<String> stack = new SequentialStack();
        StackInterface<String> stack = new LinkedStack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
       // System.out.println("栈顶元素是：" + stack.getTop());
        stack.pop();
        stack.pop();

        stack.push("e");
        System.out.println("栈顶元素是：" + stack.getTop());
        stack.pop();
        stack.pop();
        //stack.pop();
        System.out.println("栈为空：" + stack.isEmpty());
    }
}
