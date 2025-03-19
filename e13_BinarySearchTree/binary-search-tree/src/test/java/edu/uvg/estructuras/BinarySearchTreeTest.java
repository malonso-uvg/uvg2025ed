package edu.uvg.estructuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void testInOrderToConsole() {
        BinarySearchTree<Integer, String> arbolDePrueba = new BinarySearchTree<>();
        arbolDePrueba.insert(20, "Veinte");
        arbolDePrueba.insert(15, "Quince");
        arbolDePrueba.insert(35, "Treinta y cinco");
        arbolDePrueba.insert(50, "Cincuenta");
        arbolDePrueba.insert(5, "Cinco");
        arbolDePrueba.insert(18, "Dieciocho");
        arbolDePrueba.insert(30, "Treinta");

        ElementsToConsole<Integer, String> misElementos = new ElementsToConsole<>();
        arbolDePrueba.InOrder(misElementos);

        
        
    }

    @Test
    public void testInOrder() {
        BinarySearchTree<Integer, String> arbolDePrueba = new BinarySearchTree<>();
        arbolDePrueba.insert(20, "Veinte");
        arbolDePrueba.insert(15, "Quince");
        arbolDePrueba.insert(35, "Treinta y cinco");
        arbolDePrueba.insert(50, "Cincuenta");
        arbolDePrueba.insert(5, "Cinco");
        arbolDePrueba.insert(18, "Dieciocho");
        arbolDePrueba.insert(30, "Treinta");

        ListarElementos<Integer, String> misElementos = new ListarElementos<>();
        arbolDePrueba.InOrder(misElementos);

        assertEquals("Cinco", misElementos.elementos.get(0));
        assertEquals("Quince", misElementos.elementos.get(1));
        assertEquals("Dieciocho", misElementos.elementos.get(2));
        assertEquals("Veinte", misElementos.elementos.get(3));
        assertEquals("Treinta", misElementos.elementos.get(4));
        assertEquals("Treinta y cinco", misElementos.elementos.get(5));
        assertEquals("Cincuenta", misElementos.elementos.get(6));
        
    }

    @Test
    public void testCount() {
        BinarySearchTree<Integer, String> arbolDePrueba = new BinarySearchTree<>();
        assertEquals(0, arbolDePrueba.count());
        arbolDePrueba.insert(20, "Veinte");
        assertEquals(1, arbolDePrueba.count());
        arbolDePrueba.insert(15, "Quince");
        assertEquals(2, arbolDePrueba.count());
        arbolDePrueba.insert(35, "Treinta y cinco");
        assertEquals(3, arbolDePrueba.count());
        arbolDePrueba.insert(20, "Veinte");
        assertEquals(3, arbolDePrueba.count());
    }

    @Test
    public void testInsert() {
        BinarySearchTree<Integer, String> arbolDePrueba = new BinarySearchTree<>();
        assertEquals(0, arbolDePrueba.count());
        arbolDePrueba.insert(20, "Veinte");
        assertEquals(1, arbolDePrueba.count());
        arbolDePrueba.insert(15, "Quince");
        assertEquals(2, arbolDePrueba.count());
        arbolDePrueba.insert(35, "Treinta y cinco");
        assertEquals(3, arbolDePrueba.count());
        arbolDePrueba.insert(20, "Veinte");
        assertEquals(3, arbolDePrueba.count());
    }

    @Test
    public void testIsEmpty() {
        BinarySearchTree<Integer, String> arbolDePrueba = new BinarySearchTree<>();
        assertEquals(true, arbolDePrueba.isEmpty());
        arbolDePrueba.insert(20, "Veinte");
        assertEquals(false, arbolDePrueba.isEmpty());
    }

    @Test
    public void testSearch() {
        BinarySearchTree<Integer, String> arbolDePrueba = new BinarySearchTree<>();
        arbolDePrueba.insert(20, "Veinte");
        arbolDePrueba.insert(15, "Quince");
        arbolDePrueba.insert(35, "Treinta y cinco");
        assertEquals("Treinta y cinco", arbolDePrueba.search(35));
    }
}
