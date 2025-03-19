package edu.uvg.estructuras;

public class ElementsToConsole<K extends Comparable<K>, V> implements ITraversal<K, V> {

    @Override
    public void visitar(BinaryTreeNode<K, V> actualNode) {
       System.out.println(actualNode.get_value().toString());
    }
    
}
