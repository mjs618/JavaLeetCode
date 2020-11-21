package datastructure.queue;


public class QueueTester {
    public static void main(String[] args) {
        QueueInterface<String> queue = new CircularQueue<>();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
        queue.enQueue("d");
        System.out.println("队头元素为：" + queue.getHead());


    }
}
