package datastructure.linkedstack;

import datastructure.linkedlist.LinkedNode;
import datastructure.stack.StackException;
import datastructure.stack.StackInterface;

public class LinkedStack<T> implements StackInterface {
    protected LinkedNode<T> top;

    public LinkedStack() {
        top = null;
    }

    @Override
    public void push(Object element) {
        LinkedNode<T> node = new LinkedNode(element);
        node.setNext(top);
        top = node;
    }

    @Override
    public Object pop() {
        if (isEmpty()){
            throw new StackException("栈空");
        }
        T top_Node = top.getData();
        top = top.getNext();
        return top_Node;
    }

    @Override
    public Object getTop() {
        if (isEmpty()){
            throw new StackException("栈空");
        }
        T top_Node = top.getData();
        return top_Node;
    }

    @Override
    public boolean isEmpty() {
        if (top == null){
            return true;
        }
        return false;
    }
}
