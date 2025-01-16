import java.util.List;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLeves;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // runArbolBinario();
        // runArbolRecorridos();
        //runListLeves();
        //runArbolAVL();

        System.out.println("\n=== Ejecución del Binary Search Tree ===");
        runInsertBSTTest();

        System.out.println("\n=== Ejecución de Invertir Árbol Binario ===");
        runInvertBinaryTree();

        System.out.println("\n=== Ejecución de Profundidad Máxima ===");
        runDepth();
    }

    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = { 40, 20, 60, 10, 30, 50, 70, 5, 15, 55 };

        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        arbolBinario.printTree();
    }

    public static void runArbolRecorridos() {
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
        int[] valores = { 40, 20, 60, 10, 30, 50, 70, 5, 15, 55 };

        for (int valor : valores) {
            arbolRecorridos.insert(valor);
        }

        arbolRecorridos.printTree();

        // Preorden
        System.out.println("\nPreorden:");
        arbolRecorridos.preOrderRecursivo(arbolRecorridos.getRoot());

        // Inorden
        System.out.println("\nInorden:");
        arbolRecorridos.inOrderRecursivo(arbolRecorridos.getRoot());

        // Posorden
        System.out.println("\nPosorden:");
        arbolRecorridos.posOrderRecursivo(arbolRecorridos.getRoot());
    }
/* 
    public static void runListLeves() {
        ListLeves listLeves = new ListLeves();
        Node root = new Node(40);
        root.setLeft(new Node(20));
        root.setRight(new Node(60));
        root.getLeft().setLeft(new Node(10));
        root.getLeft().setRight(new Node(30));
        root.getRight().setLeft(new Node(50));
        root.getRight().setRight(new Node(70));
        root.getLeft().getLeft().setLeft(new Node(5));
        root.getLeft().getLeft().setRight(new Node(15));
        root.getRight().getLeft().setRight(new Node(55));

        
        List<List<Integer>> result = listLeves.listLeves(root);

        System.out.println("Niveles del árbol:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }

    public static void runArbolAVL() {
        ArbolAVL arbolAVL = new ArbolAVL();

        int[] valores = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};

        for (int valor : valores) {
            System.out.println("\nInsertando el valor: " + valor);
            arbolAVL.insert(valor);
            System.out.println("\nEstructura del árbol AVL después de la inserción:");
            arbolAVL.printTree();
        }

        System.out.println("\nÁrbol AVL completo:");
        arbolAVL.printTree();
    }
*/
    public static void runInsertBSTTest() {
        InsertBSTTest bst = new InsertBSTTest();
        int[] valores = {5, 3, 7, 2, 4, 6, 8};

        for (int valor : valores) {
            System.out.println("Insertando el valor: " + valor);
            bst.insert(valor);
        }

        System.out.println("\nRecorrido InOrder del BST:");
        bst.inOrder();
    }

    public static void runInvertBinaryTree() {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        System.out.println("\nÁrbol binario original en preorden:");
        invertBinaryTree.preOrder(root);

        Node invertedRoot = invertBinaryTree.invert(root);
        System.out.println("\n\nÁrbol binario invertido en preorden:");
        invertBinaryTree.preOrder(invertedRoot);
    }

    public static void runDepth() {
        Depth binaryTreeDepth = new Depth();
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        int depth = binaryTreeDepth.maxDepth(root);
        System.out.println("\nProfundidad máxima del árbol binario: " + depth);
    }

}
