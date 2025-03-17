package edu.uvg.estructuras;

public interface ITraversal<K extends Comparable<K>, V> {
    void visitar(BinaryTreeNode<K, V> actualNode);
}
