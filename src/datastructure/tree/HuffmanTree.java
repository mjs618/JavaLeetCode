package datastructure.tree;

import datastructure.linkedlist.LinkedNode;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {

    public HuffmanTree( int[] leafs) {
        if (leafs.length <= 1) {
            System.out.println("子结点个数小于2，无法构建哈夫曼树");
        }
       //huffmanTree = new HuffmanNode[leafs.length * 2 - 1];
    }

    public static void main(String[] args) {
        int arr[] = {13,7,8,3,29,6,1};
        HuffmanNode node = createHuffmanTree(arr);
        preOrder(node);
    }

    public static void preOrder(HuffmanNode node){
        if (node != null){
            node.proOrder();
        }else{
            System.out.println("二叉树为空无法遍历");
        }
    }

    public static HuffmanNode createHuffmanTree(int[] arr){
        List<HuffmanNode>  nodes= new ArrayList<>();
        for (int value :arr){
            nodes.add(new HuffmanNode(value));
        }

        while(nodes.size() > 1){
            Collections.sort(nodes);
            System.out.println("第一次");
            System.out.println("nodes =" +nodes);
            HuffmanNode node = null;
            HuffmanNode leftNode = nodes.get(0);
            HuffmanNode rightNode = nodes.get(1);

            HuffmanNode parent = new HuffmanNode(leftNode.weight + rightNode.weight);
            parent.lChild = leftNode;
            parent.rChild = rightNode;

            nodes.remove(leftNode);
            nodes.remove(rightNode);
            nodes.add(parent);
            System.out.println("第一次处理后" + nodes);

        }

        return nodes.get(0);
    }

}
