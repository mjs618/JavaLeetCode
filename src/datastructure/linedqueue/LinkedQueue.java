package datastructure.linedqueue;

import datastructure.linkedlist.LinkedNode;
import datastructure.queue.QueueException;
import datastructure.queue.QueueInterface;

public class LinkedQueue<T> implements QueueInterface<T> {
    private LinkedNode<T> front,rear;

    public LinkedQueue() {
        front = rear = new LinkedNode<T>();
    }

    @Override
    public void enQueue(T element) {
        LinkedNode<T> node = new LinkedNode<>(element);
        rear.setNext(node);
        rear = node;
    }

    @Override
    public T deQueue() {
        if(isEmpty()){
            throw new QueueException("队空");
        }
        LinkedNode<T> headNode = front.getNext();
        T headElement = headNode.getData();
        front.setNext(headNode.getNext());
        if (headNode.getNext() == null){
            rear = front;
        }
        return headElement;
    }

    @Override
    public T getHead() {
        if (isEmpty()){
            throw new QueueException("对空");
        }
        LinkedNode<T> headNode = front.getNext();
        T headElement = headNode.getData();
        return headElement;
    }

    @Override
    public boolean isEmpty() {
        if (front == rear){
            return true;
        }
        return false;
    }
}
