//depth first traversal of a graph

import java.util.LinkedList;

class Graph {
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
    void DFS(int s) {
        boolean marked[] = new boolean[verticesNumber]; //specifies whether a node was visited
 
        // Call the recursive helper function to print DFS traversal
        recursiveDFS(s, marked);
    }
 
    //recursive function to print the vertices
    void recursiveDFS(int s, boolean marked[]) {
        //mark the first vertex and show it
        marked[s] = true;
        System.out.print(s+" ");
        
        //going through the adjacent vertices and calling the DFS function again
        for (int i = 0; i<adjacentVertices[s].size(); i++) {
        	int verticeValue = adjacentVertices[s].get(i);
        	if (!marked[verticeValue]) {
        		recursiveDFS(verticeValue, marked);
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
 
        System.out.println("Following is Depth First Traversal "+ "(starting from vertex 2)");
 
        g.DFS(2);
    }
}
