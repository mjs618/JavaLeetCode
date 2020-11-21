package datastructure.tree;

import datastructure.linedqueue.LinkedQueue;
import datastructure.list.SequentialList;
import datastructure.queue.QueueInterface;

public class BinaryTree<T> implements BinaryTreeInterface {
    protected BiNode<T> root;

    public BinaryTree() {
        root = null;
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(BiNode node){
        if (node == null){
            return;
        }else{
            System.out.println(node.getData()+" ");
            preOrder(node.getlChild());
            preOrder(node.getrChild());
        }
    }

    @Override
    public void inOrder() {
        inOrder(root);

    }

    private void inOrder(BiNode<T> node) {
        if (node == null){
            return;
        }else{
            inOrder(node.getlChild());
            System.out.println(node.getData()+" ");
            inOrder(node.getrChild());
        }
    }

    @Override
    public void postOrder() {
        postOrder(root);

    }

    private void postOrder(BiNode<T> node) {
        if (node == null){
            return;
        }else{
            postOrder(node.getlChild());
            postOrder(node.getrChild());
            System.out.println(node.getData() + " ");
        }
    }

    @Override
    public void levelOrder() {
        QueueInterface<BiNode> queue = new LinkedQueue<>();
        if (root == null){
            return;
        }else{
            queue.enQueue(root);
            while (!queue.isEmpty()){
                BiNode tempNode = queue.deQueue();
                System.out.println(tempNode.getData() + " ");
                if (tempNode.getlChild() != null){
                    queue.enQueue(tempNode.getlChild());
                }
                if (tempNode.getrChild() != null){
                    queue.enQueue(tempNode.getrChild());
                }
            }
        }

    }

    @Override
    public void creatBinaryTree(SequentialList treeElement) {
        root = creatBypreOrder(treeElement);

    }
    private int elementCount = 0;
    private BiNode<T> creatBypreOrder(SequentialList<T> treeElement) {
        BiNode node;

        ++elementCount;
        if (elementCount > treeElement.length() || treeElement.getElement(elementCount).equals("# ")){
            node = null;
        }else{
            node = new BiNode<T>(treeElement.getElement(elementCount));

            node.setlChild(creatBypreOrder(treeElement));
            node.setrChild(creatBypreOrder(treeElement));
        }
        return node;

    }


}
