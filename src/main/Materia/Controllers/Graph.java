package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;

import main.Materia.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;
    
    public Graph() {
        this.nodes =new ArrayList<>();
    }

    public NodeG addNode(int value) {
        NodeG nodeGraph = new NodeG();
        nodes.add(nodeGraph);
        return nodeGraph;
        
    }
    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }
    public void printGraph() {
        for(NodeG nodeG : nodes) {
            System.out.print("Vertice "+ nodeG.getValue()+": ");
            for(NodeG nei: nodeG.getNeighbors()) {
                System.out.print(nei.getValue()+" - ");
            }
            System.out.println();
        }
    }
}
