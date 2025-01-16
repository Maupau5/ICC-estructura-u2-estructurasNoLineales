package main.Ejercicio_01_insert;
import main.Materia.Controllers.ArbolBinario;

public class InsertBSTTest {

    private ArbolBinario arbol;

    public InsertBSTTest() {
        this.arbol = new ArbolBinario();
    }

    public void insert(int value) {
        arbol.insert(value);
    }

    public void inOrder() {
        System.out.println(" ");
    }
}