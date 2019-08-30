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
public class Edge implements Comparable<Edge>{
    private Vertex one, two;
    private int weight;
    
    public Edge(Vertex one, Vertex two)
    {
        this(one,two,1);
    }
    
    public Edge(Vertex one, Vertex two, int weight)
    {
        this.one = (one.getLabel().compareTo(two.getLabel()) <= 0)? one : two;
        this.two = (this.one == one)? two : one;
    }
    
    public int getWeight()
    {
        return this.weight;
    }
    
    public Vertex getAdj(Vertex from)
    {
        return (from.equals(this.one))? two : one;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
    
    public boolean equals(Object other)
    {
        if(!(other instanceof Edge))
        {
            return false;
        }
        Edge e = (Edge)other;
        return e.one.equals(this.one)&&e.two.equals(this.two);
    }
}
