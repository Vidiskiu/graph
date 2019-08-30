/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Vidiskiu
 */
public class Graph {
    private HashMap<String,Vertex> vertices;
    private HashMap<Integer,Edge> edges;
    
    public Graph()
    {
        this.vertices= new HashMap<String,Vertex>();
        this.edges = new HashMap<Integer,Edge>();
    }
    
    public Graph(ArrayList<Vertex> vertices)
    {
        this.vertices = new HashMap<String,Vertex>();
        this.edges = new HashMap<Integer, Edge>();
        
        for(Vertex v : vertices)
        {
            this.vertices.put(v.getLabel(), v);
        }
    }
    
    public void addVertex(Vertex v)
    {
        this.vertices.put(v.getLabel(), v);
    }
    
    public boolean addEdge(Vertex one, Vertex two)
    {
        Edge e = new Edge(one,two);
        if(this.vertices.containsKey(one.getLabel()) && this.vertices.containsKey(two.getLabel()))
        {
            this.vertices.get(two.getLabel()).addNeighbour(e);
            this.vertices.get(one.getLabel()).addNeighbour(e);
            this.edges.put(e.getWeight(), e);
            return true;
        }
        else return false;
    }
}
