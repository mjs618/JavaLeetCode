package datastructure;


import datastructure.list.ListInterface;
import datastructure.list.SequentialList;

/**
 * @author mjs20
 */
public class ListTester {
    public static void main(String[] args) throws Exception {
        String[] initialList ={"a","b","c","d","e"};
        ListInterface<String> list = new SequentialList<String>(initialList,5);
        list.insert(5,"ed");
        list.insert(7,"ef");
        System.out.println("线性表的长度："+ list.length());
        list.printList();
    }
}
