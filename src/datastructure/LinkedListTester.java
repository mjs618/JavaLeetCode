package datastructure;

import datastructure.linkedlist.LinkedList;
import datastructure.list.ListInterface;

/**
 * @author mjs20
 */
public class LinkedListTester {
    public static void main(String[] args) throws Exception {
        String[] initialList = {"a","b","c","d","e","f"};
        ListInterface<String> list= new LinkedList<String>(initialList);
//        System.out.println("线性表的长度" + list.length());
//        list.printList();
//
//        String list2 = list.getElement(2);
//        System.out.println(list2);

        list.insert(3,"k");
        list.printList();
        System.out.println(" * *****************************************");
        String deleteElement = list.delete(3);
        list.printList();

    }
}
