import java.util.List;

import main.Ejercicio_03_listLeves.ListLeves;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // runArbolBinario();
        // runArbolRecorridos();
        runListLeves();
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

}
