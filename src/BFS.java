import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFS {
    private static ArrayList<Integer> visited;

    private BFS( int[][] matrix ) {
        visited = new ArrayList<>();
        for ( int i = 0; i < matrix.length; ++i )
            if ( !visited.contains( i ) )
                breadthFirstSearch( matrix[ i ], i, matrix );
    }

    private void breadthFirstSearch( int[] v, int n, int[][] matrix ) {
        System.out.println( "Visiting vertex: " + n );
        visited.add( n );

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add( n );

        while ( !queue.isEmpty() ) {
            for ( int i = 0; i < matrix[ queue.peek() ].length; ++i )
                if ( matrix[ queue.peek() ][ i ] == 1 && !visited.contains( i ) ) {
                    System.out.println( "Visiting vertex: " + i );
                    visited.add( i );
                    queue.add( i );
                }
            queue.poll();
        }
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

        new BFS( AdjGraph.matrix );
    }
}
