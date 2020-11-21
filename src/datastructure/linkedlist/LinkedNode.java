package datastructure.linkedlist;

/**
 * @author mjs20
 */
public class LinkedNode<T> {
    private T data;
    private  LinkedNode<T> next;

    public LinkedNode(){
        data = null;
        next = null;
    }

    public LinkedNode(T element){
        data = element;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T element) {
        this.data = element;
    }

    public LinkedNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedNode<T> successor) {
        this.next = successor;
    }
}
