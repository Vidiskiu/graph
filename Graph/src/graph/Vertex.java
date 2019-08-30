/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;

/**
 *
 * @author Vidiskiu
 */
public class Vertex {
    private ArrayList<Edge> neighbourhood;
    private String label;
    
    public Vertex(String label)
    {
        this.label = label;
        this.neighbourhood = new ArrayList<Edge>();
    }
    
    public String getLabel()
    {
        return this.label;
    }
    
    public void addNeighbour(Edge e)
    {
        this.neighbourhood.add(e);
    }
    
    public int getNeighbourCount()
    {
        return this.neighbourhood.size();
    }
    
    public Vertex getNeighbour(int index)
    {
        return this.neighbourhood.get(index).getAdj(this);
    }
}
