package datastructure.tree;

import datastructure.list.SequentialList;

public interface BinaryTreeInterface<T> {
    public void preOrder();
    public void inOrder();
    public void postOrder();
    public void levelOrder();

    public void creatBinaryTree(SequentialList<T> treeelement);
}
