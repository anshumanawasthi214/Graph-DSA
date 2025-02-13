import java.util.*;
public class ArrayListGraphRepresentation {
    //representation of undirecteed arraylist graph
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int n=5;
     
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        //edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);


        //edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        //edge 2--4
        adj.get(2).add(4);
        adj.get(4).add(2);

        //edge 2--5
        adj.get(2).add(5);
        adj.get(5).add(2);

        //edge 4--5
        adj.get(4).add(5);
        adj.get(5).add(4);

        //edge 3--4
        adj.get(3).add(4);
        adj.get(4).add(3);

        //printing all nodes of graph
        for(int i=1;i<=n;i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
