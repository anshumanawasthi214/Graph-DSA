public class MatrixGraph_Representation {
            //-----------------Matrix representation of Graph
    public static void main(String[] args) {
       int n=5;// no of nodes/vertices
       int m=5;// no of edges
        int adj[][]=new int[n+1][m+1];

        //edge 1---2
        adj[1][2]=1;
        adj[2][1]=1;

        //edge 1--3
        adj[1][3]=1;
        adj[3][1]=1;

        //edge 2--4
        adj[2][4]=1;
        adj[4][2]=1;

        //edge 2--5
        adj[2][5]=1;
        adj[5][2]=1;

        //edge 3--4
        adj[3][4]=1;
        adj[4][3]=1;

        //edge 4--5
        adj[4][5]=1;
        adj[5][4]=1;

        // printing all the nodes
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }

    }
}
