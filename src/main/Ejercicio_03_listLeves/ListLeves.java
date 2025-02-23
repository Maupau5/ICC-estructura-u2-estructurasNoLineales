package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLeves {

    public List<List<Integer>> listLeves(Node root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.getValue());

                
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }

                
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }

            
            result.add(currentLevel);
        }

        return result;
    }
}
