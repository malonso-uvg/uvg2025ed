package edu.uvg.estructuras;

public interface IBinaryTree<K extends Comparable<K>, V>{

    int count();

    boolean isEmpty();

    void insert(K key, V value);

    V search(K keyToFind);

    V remove(K key);

    void InOrder(ITraversal<K, V> traversalMethod);

    void PreOrder(ITraversal<K, V> traversalMethod);

    void PostOrder(ITraversal<K, V> traversalMethod);

};