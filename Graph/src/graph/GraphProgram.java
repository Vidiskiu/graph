/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author Vidiskiu
 */
public class GraphProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        
        Vertex[] vertices = new Vertex[5];
        
        for(int i=0;i<vertices.length;i++)
        {
            vertices[i] = new Vertex(""+i);
            graph.addVertex(vertices[i]);
        }
        
        for(int i=0;i<vertices.length-1;i++)
        {
            for(int j=i+1;j<vertices.length;j++)
            {
                graph.addEdge(vertices[i], vertices[j]);
            }
        }
        
        for(int i=0;i<vertices.length;i++)
        {
            System.out.println(vertices[i].getLabel()+" : ");
            for(int j=0;j<vertices[i].getNeighbourCount();j++)
            {
                System.out.print(vertices[i].getNeighbour(j).getLabel());
            }
            System.out.println();
        }
    }
    
}
