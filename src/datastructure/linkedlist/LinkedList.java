package datastructure.linkedlist;


import datastructure.list.ListException;
import datastructure.list.ListInterface;


/**
 * @author mjs20
 */
public class LinkedList<T> implements ListInterface<T> {

    private LinkedNode<T> first;

    public LinkedList(){
        first = new LinkedNode<T>();
    }

    public LinkedList(T[] init){
        first = new LinkedNode<T>();
        LinkedNode<T> preNode = null;
        for (int i = 0; i <init.length ; i++) {
            if(i==0){
                first.setData(init[i]);
                preNode = new LinkedNode<>();
                first.setNext(preNode);
            }
            else{
                preNode.setData(init[i]);
                if(i!=(init.length-1)){
                    LinkedNode<T> tempNode = new LinkedNode<>();
                    preNode.setNext(tempNode);
                    preNode = tempNode;
                }
            }
        }
    }

    @Override
    public void printList() {
        System.out.println(first.getData()+" ");
        LinkedNode<T> p = first.getNext();
        while (p != null){
            System.out.println(p.getData()+" ");
            p = p.getNext();
        }
    }



    @Override
    public int length() {
        int length = 0;
        LinkedNode<T> p = first.getNext();
        while (p != null){
            p = p.getNext();
            length++;
        }

        return length;
    }

    @Override
    public int locate(T element) {
        LinkedNode<T> p = first.getNext();
        int count = 1;
        while(p != null){
            if(p.getData() == element){
                return count;
            }
            p = p.getNext();
            count++;
        }
        return 0;
    }


    @Override
    public T getElement(int i)  {
        LinkedNode<T> p = first.getNext();
        int count = 1;
        while (p != null && count < i){
            p = p.getNext();
            count++;
        }
        if(p == null){
            throw new ListException("逻辑位置异常");
        }
        return p.getData();
    }

    @Override
    public void insert(int i, T element)  {
        LinkedNode<T> p = first.getNext();
        int count = 1;
        while (p != null && count < i){
            p = p.getNext();
            count++;
        }
        if(p == null){
            throw new ListException("插入位置异常");
        }
        LinkedNode<T> node = new LinkedNode<T>(element);
        node.setNext(p.getNext());
        p.setNext(node);
    }


    @Override
    public T delete(int i)  {
        LinkedNode<T> p = first.getNext();
        int count = 1;
        while(p != null && count < i){
            p = p.getNext();
            count++;
        }
        if(p == null || p.getNext() == null){
            throw new ListException("删除位置异常");
        }
        LinkedNode<T> q = p.getNext();
        T deleteNode = q.getData();
        p.setNext(q.getNext());
        return deleteNode;
    }

    @Override
    public boolean isEmpty() {
        if (first.getNext() == null){
            return true;
        }
        return false;
    }
}
