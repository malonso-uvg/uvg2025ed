package edu.uvg.estructuras;

public class BinarySearchTree<K extends Comparable<K>, V> implements IBinaryTree<K, V> {

    private int _count;
    private BinaryTreeNode<K, V> _root;

    public BinarySearchTree(){
        _count = 0;
        _root = null;
    }

    @Override
    public int count() {
        return _count;
    }

    @Override
    public boolean isEmpty() {
        return _count == 0;
    }

    @Override
    public void insert(K key, V value) {
        BinaryTreeNode<K, V> newNode = new BinaryTreeNode<>(key, value, null, false);

        if (isEmpty()){
            _root = newNode;
            _count++;
        } else {
            internalInsert(_root, newNode);
        }
    }

    private void internalInsert(BinaryTreeNode<K, V> parent, BinaryTreeNode<K, V> newNode){
        if (parent.get_key().compareTo(newNode.get_key()) > 0){ //parent es mayor, me voy para la izquierda

            if (parent.get_leftChild() == null){ //Lo inserto acá
                newNode.setIsRightChild(false);
                newNode.set_parent(parent);
                parent.set_leftChild(newNode);
                _count++;
            } else { //Seguir buscando
                internalInsert(parent.get_leftChild(), newNode);
            }   

        } else if (parent.get_key().compareTo(newNode.get_key()) < 0){ //parent es menor, me voy para la derecha

            if (parent.get_rightChild() == null){ //Lo inserto acá
                newNode.setIsRightChild(true);
                newNode.set_parent(parent);
                parent.set_rightChild(newNode);
                _count++;
            } else { //Seguir buscando
                internalInsert(parent.get_rightChild(), newNode);
            }   
            
        } else {
            return; //Improve: Lanzar una excepción indicando que el valor ya existe
        }
    }

    @Override
    public V search(K keyToFind) {
        if (isEmpty()){
            return null;
        } else {
            return internalSearch(_root, keyToFind);
        }
    }

    private V internalSearch(BinaryTreeNode<K, V> parent, K keyToFind){
        if (parent != null){
            if (parent.get_key().compareTo(keyToFind) > 0){ //Seguir buscando en la izquierda
                return internalSearch(parent.get_leftChild(), keyToFind);
            } else if (parent.get_key().compareTo(keyToFind) < 0) {//seguir buscando en la derecha
                return internalSearch(parent.get_rightChild(), keyToFind);
            } else { //es 0, por lo tanto son iguales y este es el valor buscado
                return parent.get_value();
            }
        } else {
            return null;
        }
    }



    @Override
    public V remove(K key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void InOrder(ITraversal<K, V> traversalMethod) {
        if (isEmpty()){
            return;
        } else {
            internalInOrder(traversalMethod, _root);
        }
    }

    private void internalInOrder(ITraversal<K, V> traversalMethod, BinaryTreeNode<K, V> actualNode){
        if (actualNode.get_leftChild() != null){
            internalInOrder(traversalMethod, actualNode.get_leftChild());
        }

        traversalMethod.visitar(actualNode);

        if (actualNode.get_rightChild() != null){
            internalInOrder(traversalMethod, actualNode.get_rightChild());
        }
    }

    @Override
    public void PreOrder(ITraversal<K, V> traversalMethod) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PreOrder'");
    }

    @Override
    public void PostOrder(ITraversal<K, V> traversalMethod) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PostOrder'");
    }
    
}
