package datastructure.stack;

public interface StackInterface<T>{
    void push(T element);
    T pop();
    T getTop();
    boolean isEmpty();
}
