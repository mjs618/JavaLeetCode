package datastructure.graph;

public class GraphTester {
    public static void main(String[] args) throws GraphException {
        String[] init_Vertices = {"A","B","C","D"};
        System.out.println("无向图测试：");
        GraphInterface<String> graph = new MGraph<>(init_Vertices,4,1);
        graph.BFS(0);
        graph.DFS(1);


    }
}
