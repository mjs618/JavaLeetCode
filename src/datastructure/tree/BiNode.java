package datastructure.tree;

public class BiNode<T> {
    private T data;
    private BiNode<T> lChild,rChild;

    public BiNode(T element) {
        this.data = element;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BiNode<T> getlChild() {
        return lChild;
    }

    public void setlChild(BiNode<T> lChild) {
        this.lChild = lChild;
    }

    public BiNode<T> getrChild() {
        return rChild;
    }

    public void setrChild(BiNode<T> rChild) {
        this.rChild = rChild;
    }
}
