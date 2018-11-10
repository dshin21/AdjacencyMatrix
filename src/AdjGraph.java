public class AdjGraph {

    public static int[][] matrix;
    public static boolean isDirected;

    public AdjGraph(int v) {
        matrix = new int[v][v];
        isDirected = false;
    }

    public void addEdge(int u, int v) {
        matrix[u][v] = 1;

        if (!isDirected) matrix[v][u] = 1;
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                temp.append(matrix[i][j]).append(" ");
            }
            temp.append("\n");
        }
        return temp.toString();
    }

    public int degree(int v) {
        int degree = 0;
        for (int i = 0; i < matrix[v].length; ++i)
            degree += matrix[v][i];
        return degree;
    }

    public int inDegree(int v) {
        int degree = 0;
        for (int[] aMatrix : matrix) degree += aMatrix[v];
        return degree;
    }

    public int outDegree(int v) {
        int degree = 0;
        for (int i = 0; i < matrix[v].length; ++i)
            degree += matrix[v][i];
        return degree;
    }

    public boolean isIsDirected() {
        return isDirected;
    }
}
