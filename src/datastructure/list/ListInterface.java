package datastructure.list;

/**
 * @author mjs20
 */
public interface ListInterface<T> {

    /**
     * 遍历线性表
     */
    public void printList();

    /**
     *
     * 求线性表的长度
     *
     * @return int
     */
    public int length();

    /**
     * 按值查找
     * @param element
     * @return
     */
    public int locate(T element); //

    /**
     * 按位查找
     * @param i
     * @return
     */
    public T getElement(int i) throws Exception;

    /**
     * 在指定的位置，
     * @param i
     * @param element
     */
    public  void insert(int i, T element) throws Exception;

    /**
     * 删除指定逻辑位的元素
     * @param i
     * @return
     */
    T delete(int i) throws Exception;

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty();

}
