//breadth first traversal of a graph

import java.util.LinkedList;

public class Graph {
    private int verticesNumber;   //number of vertices in a graph
    private LinkedList<Integer> adjacentVertices[]; //each node has a list of adjacent vertices 
    
    //no-arg constructor
    Graph() {
    	
    }
    
    //parameterized constructor
    Graph (int v) {
    	this.verticesNumber = v; //creating the graph with a specified number of nodes
    	adjacentVertices = new LinkedList[v]; //creating a list of adjacent vertices for each node
        for (int i=0; i<v; i++) {
        	adjacentVertices[i] = new LinkedList();
        }
           
    }
 
    //adding an edge
    void addEdge(int v,int w) {
    	adjacentVertices[v].add(w);
    }
 
    //s is the starting index
    void BFS(int s) {                   
        boolean marked[] = new boolean[verticesNumber];   //specifies whether a node was visited
 
        //implementing the order of showing the vertices with the help of a queue
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        //the starting node is visited and added to the queue
        marked[s]=true;
        queue.add(s);
 
        //continue while there is something in the queue
        while (queue.size() != 0) {
            //dequeue and show the node
            s = queue.poll();
            System.out.print(s+" ");
 
            //going through the adjacent vertices and 
            //adding them to the queue if they have not been marked
            for (int i = 0; i<adjacentVertices[s].size(); i++) {
            	int verticeValue = adjacentVertices[s].get(i);
            	if (!marked[verticeValue]) {
                    marked[verticeValue] = true;
                    queue.add(verticeValue);
                }
            }
        }
    }
 
    /* Driver method to test above functions */
    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is BFS "+ "(starting from vertex 2)");
 
        g.BFS(2);
    }
}
