
package edu.uvg.estructuras;

import java.util.ArrayList;

public class ListarElementos<K extends Comparable<K>, V> implements ITraversal<K , V>{

    public ArrayList<V> elementos = new ArrayList<>();

    @Override
    public void visitar(BinaryTreeNode<K, V> actualNode) {
        elementos.add(actualNode.get_value());
    }
    
}
