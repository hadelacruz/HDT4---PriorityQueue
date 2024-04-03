public interface PriorityQueue<K extends Comparable<K>,V> {
    /**
     * 
     * @param key clave del nodo
     * @param value valor del nodo
     */
    void insert(K key, V value);

    /**
     * 
     * @return retorna el nodo con la clave minima(prioridad)
     */
    Node<K, V> delete();  
    
    /**
     * 
     * @return true si el arbol es vació y false de lo contrario
     */
    boolean isEmpty();
}
