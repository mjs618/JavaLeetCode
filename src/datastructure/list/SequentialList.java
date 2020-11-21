package datastructure.list;


import java.lang.Override;
import java.util.Arrays;

/**
 * @author mjs20
 */
public class SequentialList<T> implements ListInterface<T> {

    private  T[] list;
    private final static int LIST_SIZE = 100;
    private int length;


    public SequentialList(){
        list = (T[])(new Object[LIST_SIZE]);
        length = 0;
    }

    public SequentialList(T[] initialList, int n)  {
        list =(T[]) (new Object[LIST_SIZE]);
        length = n;
        if (length > LIST_SIZE) {
            throw  new ListException("构造线性表，长度越界。");
        }

        for (int i = 0; i < length; i++ ){
            list[i] = initialList[i];
        }

    }





    @Override
    public void printList() {
        if (isEmpty()){
            System.out.println("空表");
        }
        for (int i = 0; i < length ; i++) {
            System.out.println(list[i]+" ");
        }
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int locate(T elememt) {

        int result = 0;

        for (int i = 0; i <length ; i++) {
            if(list[i].equals(elememt)){
                result = i + 1;
                break;
            }
        }
        return result;
    }

    @Override
    public T getElement(int i)  {
        if (isEmpty()){
            throw  new ListException("空表");
        }
        if(i< 1 || i > length ){
            throw  new ListException("查找位置非法");
        }
        T element = list[i - 1];

        return element;
    }

    @Override
    public void insert(int i, T element)  {
        if (length == list.length){
            throw  new ListException("线性表满，插入异常");
        }
        if (i<1|| i > length + 1 ){
            throw new ListException("插入位置异常");
        }
//        for(int j=length-1;j>=i-1;j--){
//           list[j+1] = list[j];
//        }
        for (int index = length; index >= i ; index--) {
            list[index] = list[index-1];
        }
        list[i-1] = element;
        length++;
    }

    @Override
    public T delete(int i)  {
        if (isEmpty()){
            throw new ListException("线性表为空");
        }
        if (i<1|| i > length + 1){
            throw new ListException("删除位置异常");
        }
        T element = list[i-1];
        for (int j=i;j<length;j++){
            list[j-1] = list[j];
        }
        return element;
    }

    @Override
    public boolean isEmpty() {

        if(length == 0) {
            return true;
        }
        return false;
    }


}
