package main.Materia.Models;

import java.util.LinkedList;
import java.util.List;

public class NodeG {
    private int value;
        private LinkedList neighbors;
    
        public void NodeG (int value) {
            this.value = value;
            this.neighbors = new LinkedList<>();
    }
    public int getValue() {
        return value;
    }

    public List <NodeG> getNeighbors() {
        return neighbors;
    }
    public void addNeighbor(NodeG neighbor) {
        this.neighbors.add(neighbor);
    }

    
}
