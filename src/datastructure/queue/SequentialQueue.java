package datastructure.queue;

public class SequentialQueue<T> implements QueueInterface<T> {
    protected T[] queue;
    private final static int QUEUE_SIZE = 100;
    protected int rear,front;

    public SequentialQueue() {
        queue =  (T[])(new Object[QUEUE_SIZE]);
        front = rear = 0;
    }

    @Override
    public void enQueue(T element) {
        if((rear + 1) % QUEUE_SIZE == front ){
            throw new QueueException("队满");
        }
        rear = (rear + 1 ) % QUEUE_SIZE;
        queue[rear] = element;
    }

    @Override
    public T deQueue() {
        if (isEmpty()){
            throw new QueueException("队空");
        }
        front = (front + 1) % QUEUE_SIZE;
        T queueHead = queue[front];
        return queueHead;
    }

    @Override
    public T getHead() {
        if (isEmpty()){
            throw new QueueException("队空");
        }
        T headElement = queue[front + 1];
        return headElement;
    }

    @Override
    public boolean isEmpty() {

        if (front == rear){
           return  true;
        }
        return false;
    }
}
