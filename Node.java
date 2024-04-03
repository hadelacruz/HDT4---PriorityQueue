public class Node <K,V> {
    private K key;
    private V value;
    private Node<K, V> left;
    private Node<K, V> right;


    public Node(K key, V value) {
        this.key = key;
        this.value = value;

    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K,V> getLeft() {
        return this.left;
    }

    public void setLeft(Node<K,V> left) {
        this.left = left;
    }

    public Node<K,V> getRight() {
        return this.right;
    }

    public void setRight(Node<K,V> right) {
        this.right = right;
    }



}
