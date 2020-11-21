package datastructure.graph;

import datastructure.queue.CircularQueue;
import datastructure.queue.QueueInterface;

import java.util.Scanner;

public class MGraph<T> implements GraphInterface<T>  {

    protected int vertices_num;
    protected int edge_nun;
    protected T[] vertices;
    protected int[][] adjMatrix;
    boolean[] visited;

    public MGraph(T[] init_vertices,int n,int e) throws GraphException {
        if(n==0){
            throw new GraphException("无顶点，图构造失败。");
        }
        vertices_num = n;
        this.edge_nun = e;
        this.vertices = (T[]) new Object[vertices_num];
        this.adjMatrix = new int[vertices_num][vertices_num];
        for (int i = 0; i < n ; i++) {
            vertices[i] = init_vertices[i];
        }
        if (edge_nun > 0){
            Scanner reader = new Scanner(System.in);
            for (int i = 0; i <e ; i++) {
                System.out.println("输入第" + i+"条边第1个顶点信息");
                int vertexl = reader.nextInt();
                System.out.println("输入第" + i+"条边第2个顶点信息");
                int vertex2 = reader.nextInt();
                adjMatrix[vertexl][vertex2] = 1;
                adjMatrix[vertex2][vertexl] = 1;
            }
        }
    }

    @Override
    public void DFS(int startIndex) {
        visited = new boolean[vertices_num];
        iteratorDFT(startIndex);
    }

    private void iteratorDFT(int startIndex) {
        System.out.println(vertices[startIndex].toString() + " ");
        visited[startIndex] = true;
        for (int i = 0; i <vertices_num ; i++) {
            if (adjMatrix[startIndex][i] == 1 && !visited[i]){
                iteratorDFT(i);
            }
        }
    }

    @Override
    public void BFS(int startIndex) {
        visited  = new boolean[vertices_num];
        QueueInterface<Integer> queue = new CircularQueue<Integer>();
        int front_vertex;
        System.out.println(vertices[startIndex].toString() + " ");
        visited[startIndex] = true;
        queue.enQueue(startIndex);
        while (!queue.isEmpty()){
            front_vertex = queue.deQueue();
            for (int i = 0; i < vertices_num; i++) {
                if (adjMatrix[front_vertex][i] == 1 && !visited[i]){
                    System.out.println(vertices[i].toString() + " ");
                    visited[i] = true;
                    queue.enQueue(i);
                }

            }
        }

    }
}
