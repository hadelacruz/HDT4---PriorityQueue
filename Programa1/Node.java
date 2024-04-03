/**
 * Clase que representa un nodo en un árbol binario.
 * Cada nodo tiene una clave y un valor asociado, y puede tener referencias a sus hijos izquierdo y derecho.
 * 
 * @param <K> Tipo de la clave del nodo.
 * @param <V> Tipo del valor del nodo.
 */
public class Node <K,V> {
    private K key;
    private V value;
    private Node<K, V> left;
    private Node<K, V> right;


    /**
     * Constructor de la clase Node.
     * 
     * @param key   Prioridad
     * @param value Objeto Paciente
     */
    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Método para obtener la clave del nodo.
     * 
     * @return Clave del nodo.
     */
    public K getKey() {
        return this.key;
    }

    /**
     * Método para establecer la clave del nodo.
     * 
     * @param key Nueva clave del nodo.
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Método para obtener el valor asociado al nodo.
     * 
     * @return Valor asociado al nodo.
     */
    public V getValue() {
        return this.value;
    }

    /**
     * Método para establecer el valor asociado al nodo.
     * 
     * @param value Nuevo valor asociado al nodo.
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     * Método para obtener la referencia al hijo izquierdo del nodo.
     * 
     * @return Referencia al hijo izquierdo del nodo.
     */
    public Node<K, V> getLeft() {
        return this.left;
    }

    /**
     * Método para establecer la referencia al hijo izquierdo del nodo.
     * 
     * @param left Nueva referencia al hijo izquierdo del nodo.
     */
    public void setLeft(Node<K, V> left) {
        this.left = left;
    }

    /**
     * Método para obtener la referencia al hijo derecho del nodo.
     * 
     * @return Referencia al hijo derecho del nodo.
     */
    public Node<K, V> getRight() {
        return this.right;
    }

    /**
     * Método para establecer la referencia al hijo derecho del nodo.
     * 
     * @param right Nueva referencia al hijo derecho del nodo.
     */
    public void setRight(Node<K, V> right) {
        this.right = right;
    }


}
