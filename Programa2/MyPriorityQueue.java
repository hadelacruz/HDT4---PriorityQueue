import java.util.PriorityQueue;

public class MyPriorityQueue {

    private PriorityQueue<Paciente> queue = new PriorityQueue<>();

    /**
     * 
     * @param paciente objeto paciente del archivo txt
     */
    // Método para insertar un paciente en la cola de prioridad
    public void insert(Paciente paciente) {
        queue.offer(paciente);
    }

    /**
     * 
     * @return objeto paciente con mayor prioridad
     */
    // Método para eliminar y retornar el paciente con la mayor prioridad
    public Paciente delete() {
        if (!isEmpty()) {
            return queue.poll();
        } else {
            return null; // Devuelve null si la cola de prioridad está vacía
        }
    }

    /**
     * 
     * @return rtorna true si esta vacio y false de lo contrario
     */
    // Método para verificar si la cola de prioridad está vacía
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
