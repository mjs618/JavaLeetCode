package datastructure;

import datastructure.linedqueue.LinkedQueue;
import datastructure.queue.QueueInterface;
import datastructure.queue.SequentialQueue;

public class QueueTester {

    public static void main(String[] args) {
        //顺序队列
        //QueueInterface<String> queue = new SequentialQueue();

        //链表队列
        QueueInterface<String> queue = new LinkedQueue();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
        queue.enQueue("s");
        System.out.println("队列元素为：" + queue.getHead());

        queue.deQueue();
        queue.deQueue();

        //queue.deQueue();

        System.out.println("队列元素为：" + queue.getHead());



    }
}
