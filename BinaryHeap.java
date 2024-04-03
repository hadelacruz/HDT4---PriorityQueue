public class BinaryHeap <K extends Comparable<K>,V> implements ProrityQueue<K, V> {
    private Node <K,V> root;

    /**
     * @param key
     * @param value
     */
    public void insert(K key, V value) {
        root = insert(root, key, value);
    }

    /**
     * @param node
     * @param key
     * @param value
     * @return
     */
    private Node<K, V> insert(Node<K,V> node, K key, V value){
        if (node == null) {
            return new Node<>(key, value);
        }
        if(key.compareTo(node.getKey())<0){
            node.setLeft(insert(node.getLeft(), key, value));
        }else{
            node.setRight(insert(node.getRight(), key, value));
        }

        return node;
    }

    
    public Node delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    
}