package datastructure.tree;

import org.jetbrains.annotations.NotNull;

public class HuffmanNode implements Comparable<HuffmanNode> {
    int weight = -1;
    HuffmanNode lChild;
    HuffmanNode rChild ;
    public HuffmanNode(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HuffmanNode{" +
                "weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(@NotNull HuffmanNode o) {
        return this.weight - o.weight;
    }

    public void proOrder(){
        System.out.println(this);
        if(this.lChild != null){
            this.lChild.proOrder();
        }
        if (this.rChild != null){
            this.rChild.proOrder();
        }
    }
}
