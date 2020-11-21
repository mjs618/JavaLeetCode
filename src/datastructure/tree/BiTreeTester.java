package datastructure.tree;

import datastructure.list.SequentialList;

public class BiTreeTester {
    public static void main(String[] args) {
        BinaryTreeInterface binaryTree = new BinaryTree();
        String initialList[] = {"A","B","#","D","#","#","C","#","#"};
        SequentialList<String> treeElement = new SequentialList(initialList,9);
        binaryTree.creatBinaryTree(treeElement);
        System.out.println("二叉树前序遍历：");
        binaryTree.preOrder();

        System.out.println("二叉树中序遍历：");
        binaryTree.inOrder();

        System.out.println("二叉树后序遍历：");
        binaryTree.postOrder();

        System.out.println("二叉树层次遍历：");
        binaryTree.levelOrder();

    }
}
