/**
 * Implementación de una cola de prioridad utilizando un heap binario.
 * El heap binario se implementa como un árbol binario completo donde cada nodo tiene
 * una clave y un valor asociado. Los nodos se organizan de manera que el nodo raíz
 * tenga la clave más alta y los nodos hijos tengan claves más bajas.
 * 
 * @param <K> Tipo de datos de la clave.
 * @param <V> Tipo de datos del valor asociado a la clave.
 */
public class BinaryHeap <K extends Comparable<K>,V> implements PriorityQueue<K, V> {
    private Node<K, V> root;

    /**
     * Constructor de la clase BinaryHeap.
     * Crea un nuevo BinaryHeap con la raíz inicializada como nula.
     */
    public BinaryHeap() {
        this.root = null;
    }
    
    /**
     * Método para insertar un nuevo nodo en el BinaryHeap.
     * 
     * @param key   Prioridad del paciente
     * @param value Objeto Paciente
     */
    public void insert(K key, V value) {
        root = insert(root, key, value);
    }

    /**
     * Método privado para insertar un nuevo nodo en el BinaryHeap.
     * 
     * @param node  Nodo actual en el que se está insertando.
     * @param key   Prioridad del paciente
     * @param value Objeto Paciente
     * @return Nodo actualizado después de la inserción.
     */
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

    /**
     * Método para eliminar y retornar el nodo con la mayor prioridad del BinaryHeap.
     * 
     * @return Nodo con la mayor prioridad.
     */
    public Node<K, V> delete() {
        if (isEmpty()) {
            return null;
        }

        Node<K, V> lowerPriority = searchMinNode(root);
        root = deleteNode(root, lowerPriority.getKey());
        return lowerPriority;
    }

    /**
     * Método privado para eliminar un nodo con una clave específica del BinaryHeap.
     * 
     * @param node Nodo actual en el que se está eliminando.
     * @param key  Prioridad del nodo que se desea eliminar.
     * @return Nodo actualizado después de la eliminación.
     */
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

    /**
     * Método privado para buscar el nodo con la menor prioridad en el BinaryHeap.
     * 
     * @param node Nodo actual en el que se está buscando.
     * @return Nodo con la menor clave.
     */
    private Node<K, V> searchMinNode(Node<K, V> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    /**
     * Método para verificar si el BinaryHeap está vacío.
     * 
     * @return true si el BinaryHeap está vacío, false de lo contrario.
     */
    public boolean isEmpty() {
        return root == null;
    }
}
