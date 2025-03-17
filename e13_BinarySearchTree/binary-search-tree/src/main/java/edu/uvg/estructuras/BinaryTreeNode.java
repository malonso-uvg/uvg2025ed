package edu.uvg.estructuras;

public class BinaryTreeNode<K extends Comparable<K>, V> {
    private K _key;
    private V _value;
    private BinaryTreeNode<K, V> _leftChild;
    private BinaryTreeNode<K, V> _rightChild;
    private BinaryTreeNode<K, V> _parent;
    private boolean isRightChild;

    public K get_key() {
        return _key;
    }
    public void set_key(K _key) {
        this._key = _key;
    }
    public V get_value() {
        return _value;
    }
    public void set_value(V _value) {
        this._value = _value;
    }
    public BinaryTreeNode<K, V> get_leftChild() {
        return _leftChild;
    }
    public void set_leftChild(BinaryTreeNode<K, V> _leftChild) {
        this._leftChild = _leftChild;
    }
    public BinaryTreeNode<K, V> get_rightChild() {
        return _rightChild;
    }
    public void set_rightChild(BinaryTreeNode<K, V> _rightChild) {
        this._rightChild = _rightChild;
    }
    public BinaryTreeNode<K, V> get_parent() {
        return _parent;
    }
    public void set_parent(BinaryTreeNode<K, V> _parent) {
        this._parent = _parent;
    }
    public boolean isRightChild() {
        return isRightChild;
    }
    public void setIsRightChild(boolean isRightChild) {
        this.isRightChild = isRightChild;
    }

    public BinaryTreeNode(K key, V value, BinaryTreeNode<K, V> parent, boolean isrightchild){
        set_key(key);
        set_value(value);
        set_parent(parent);
        set_rightChild(null);
        set_leftChild(null);
        setIsRightChild(isrightchild);
    }    
}
