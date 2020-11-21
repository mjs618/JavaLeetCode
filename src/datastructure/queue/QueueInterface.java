package datastructure.queue;

public interface QueueInterface<T> {
    public void enQueue(T element);
    public  T deQueue();
    public T getHead();
    public boolean isEmpty();
}
