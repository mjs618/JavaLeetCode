package datastructure.linkedlist;

/**
 * @author mjs20
 */
public class DoubleNode <T>{
    private T data;
    private DoubleNode<T> next;
    private DoubleNode<T> prior;

    public DoubleNode() {
        data = null;
        next = null;
        prior = null;
    }

    public DoubleNode(T element) {
        data = element;
        next = null;
        prior = null;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleNode<T> getPrior() {
        return prior;
    }

    public void setPrior(DoubleNode<T> prior) {
        this.prior = prior;
    }
}
