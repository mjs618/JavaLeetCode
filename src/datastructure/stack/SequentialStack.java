package datastructure.stack;

public class SequentialStack<T> implements StackInterface<T> {

    protected T[] stack;
    private final static  int STACK_SIZE = 100;
    protected int top;


    public SequentialStack() {
        stack = (T[])(new Object[STACK_SIZE]);
        top =-1;
    }

    @Override
    public void push(T element) {
        if(top == STACK_SIZE -1){
            throw new StackException("栈满");
        }
        stack[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            throw new StackException("栈空");
        }
        T result  = stack[top--];
        return result;
    }

    @Override
    public T getTop() {
        if(isEmpty()){
            throw new StackException("栈空");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1){
            return true;
        }
        return false;
    }
}
