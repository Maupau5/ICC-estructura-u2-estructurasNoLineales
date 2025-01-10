package main.Materia.Controllers;

import main.Materia.Models.Node;

public class ArbolRecorridos {
    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }

        return node;
    }

    public void preOrderRecursivo(Node node) {
        if (node != null) {
            System.out.print(node.getValue() + ", ");
            preOrderRecursivo(node.getLeft());
            preOrderRecursivo(node.getRight());
        }
    }

    public void posOrderRecursivo(Node node) {
        if (node != null) {
            posOrderRecursivo(node.getLeft());
            posOrderRecursivo(node.getRight());
            System.out.print(node.getValue() + ", ");
        }
    }

    public void inOrderRecursivo(Node node) {
        if (node != null) {
            inOrderRecursivo(node.getLeft());
            System.out.print(node.getValue() + ", ");
            inOrderRecursivo(node.getRight());
        }
    }

    // Métodos públicos para iniciar los recorridos desde la raíz
    public void preOrder() {
        preOrderRecursivo(root);
    }

    public void inOrder() {
        inOrderRecursivo(root);
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }
    
    public void printTree() {
        printTree(root, " ", true);
    }

    private void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├──" : "└──") + node.getValue());
            if (node.getLeft() != null || node.getRight() != null) {
                if (node.getLeft() != null) {
                    printTree(node.getLeft(), prefix + (isLeft ? "|   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "|   " : "    ") + "├── null");
                }

                if (node.getRight() != null) {
                    printTree(node.getRight(), prefix + (isLeft ? "|   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "|   " : "    ") + "└── null");
                }
            }
        }
    }
    public Node getRoot() {
        return root;
    }
    
}
