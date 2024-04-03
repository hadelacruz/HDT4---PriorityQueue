public class BinaryHeap <K extends Comparable<K>,V> implements PriorityQueue<K, V> {
    private Node<K, V> root;

    // Constructor
    public BinaryHeap() {
        this.root = null;
    }
    
    public void insert(K key, V value) {
        root = insert(root, key, value);
    }

    private Node<K, V> insert(Node<K,V> node, K key, V value){
        if (node == null) {
            return new Node<>(key, value);
        }
        if(key.compareTo(node.getKey()) < 0){
            node.setLeft(insert(node.getLeft(), key, value));
        } else {
            node.setRight(insert(node.getRight(), key, value));
        }
        return node;
    }

    public Node<K, V> delete() {
        if (isEmpty()) {
            return null;
        }

        Node<K, V> lowerPriority = searchMinNode(root);
        root = deleteNode(root, lowerPriority.getKey());
        return lowerPriority;
    }

    private Node<K, V> deleteNode(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(deleteNode(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(deleteNode(node.getRight(), key));
        } else {
            // Nodo a eliminar encontrado
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }

            // El Node tien dos hijos
            Node<K, V> successor = searchMinNode(node.getRight());
            node.setKey(successor.getKey());
            node.setValue(successor.getValue());
            node.setRight(deleteNode(node.getRight(), successor.getKey()));
        }
        return node;
    }

    private Node<K, V> searchMinNode(Node<K, V> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public boolean isEmpty() {
        return root == null;
    }
}
