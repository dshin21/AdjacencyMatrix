import java.util.ArrayList;

public class DFS {
    private static ArrayList<Integer> visited;

    private DFS( int[][] matrix ) {
        visited = new ArrayList<>();
        for ( int i = 0; i < matrix.length; ++i )
            if ( !visited.contains( i ) )
                depthFirstSearch( matrix[ i ], i, matrix );
    }

    private void depthFirstSearch( int[] v, int n, int[][] matrix ) {
        System.out.println( "Visiting vertex :" + n );
        visited.add( n );

        for ( int i = 0; i < v.length; ++i )
            if ( v[ i ] == 1 && !visited.contains( i ) )
                depthFirstSearch( matrix[ i ], i, matrix );
    }

    public static void main( String[] args ) {
        AdjGraph g = new AdjGraph( 8 );
        g.addEdge( 0, 1 );
        g.addEdge( 0, 2 );
        g.addEdge( 0, 4 );
        g.addEdge( 1, 3 );
        g.addEdge( 1, 5 );
        g.addEdge( 2, 3 );
        g.addEdge( 2, 6 );
        g.addEdge( 3, 7 );
        g.addEdge( 4, 5 );
        g.addEdge( 4, 6 );
        g.addEdge( 5, 7 );
        g.addEdge( 6, 7 );
        System.out.println( g.toString() );
        new DFS( AdjGraph.matrix );
    }
}
