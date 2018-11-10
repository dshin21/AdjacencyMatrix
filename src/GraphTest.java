public class GraphTest {
    public static void main(String[] args) {
        AdjGraph first = new AdjGraph(5);

        first.addEdge(0, 1);
        first.addEdge(0, 3);
        first.addEdge(0, 4);
        first.addEdge(1, 2);
        first.addEdge(1, 4);
        first.addEdge(2, 3);
        first.addEdge(3, 4);

        System.out.println("===============");
        System.out.println(first.toString());
        System.out.println("degree[0] = " + first.degree(0));
        System.out.println("degree[2] = " + first.degree(2));


        AdjGraph second = new AdjGraph(4);

        second.addEdge(0, 1);
        second.addEdge(1, 2);
        second.addEdge(2, 3);

        System.out.println("===============");
        System.out.println(first.toString());

        System.out.println("degree[0] = " + second.degree(0));
        System.out.println("degree[2] = " + second.degree(2));


        AdjGraph directed = new AdjGraph(5);
        AdjGraph.isDirected = true;
        boolean d = directed.isIsDirected();

        directed.addEdge(0, 1);
        directed.addEdge(0, 3);
        directed.addEdge(0, 4);
        directed.addEdge(1, 2);
        directed.addEdge(1, 4);
        directed.addEdge(2, 3);
        directed.addEdge(3, 4);


        System.out.println("===============");
        System.out.println("Directed Graph:");
        System.out.println("directed = " + d);
        System.out.println();
        System.out.println(directed.toString());

        System.out.println("degree[0] In Degree = " + directed.inDegree(0));
        System.out.println("degree[0] Out Degree= " + directed.outDegree(0));
        System.out.println();
        System.out.println("degree[2] In Degree = " + directed.inDegree(2));
        System.out.println("degree[2] Out Degree= " + directed.outDegree(2));
        System.out.println("===============");

    }
}
