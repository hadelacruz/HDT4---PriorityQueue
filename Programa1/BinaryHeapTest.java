import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BinaryHeapTest {

    BinaryHeap binaryHeap = new BinaryHeap<>();

    /**
     * Prueba para el método insert.
     * Se insertan varios pacientes en el BinaryHeap
     */
    @Test
    void insertTest() {
        // Creamos pacientes
        Paciente paciente1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        Paciente paciente2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente paciente3 = new Paciente("Lorenzo Toledo", "chikungunya", "E");

        // Insertamos pacientes
        binaryHeap.insert(paciente1.getPrioridad(), paciente1);
        binaryHeap.insert(paciente2.getPrioridad(), paciente2);
        binaryHeap.insert(paciente3.getPrioridad(), paciente3);

        // Verificamos que el heap no esté vacío
        assertFalse(binaryHeap.isEmpty());

        // Verificamos que los pacientes se hayan insertado correctamente
        assertEquals(paciente2, binaryHeap.delete().getValue());
        assertEquals(paciente1, binaryHeap.delete().getValue());
        assertEquals(paciente3, binaryHeap.delete().getValue());
    }

    /**
     * Prueba para el método delete.
     * Se insertan varios pacientes en el BinaryHeap y luego se elimina el paciente
     * con la prioridad más alta. Se verifica que el paciente eliminado sea el correcto.
     */
    @Test
    void deleteTes() {
        // Creamos pacientes
        Paciente paciente1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        Paciente paciente2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente paciente3 = new Paciente("Lorenzo Toledo", "chikungunya", "E");

        binaryHeap.insert(paciente1.getPrioridad(), paciente1);
        binaryHeap.insert(paciente2.getPrioridad(), paciente2);
        binaryHeap.insert(paciente3.getPrioridad(), paciente3);

        assertFalse(binaryHeap.isEmpty());

        Node<String, Paciente> deletedNode = binaryHeap.delete();

        //Verificar que el paciente eliminado sea el de prioridad A
        assertNotNull(deletedNode);
        assertEquals("A", deletedNode.getKey());
        assertEquals(paciente2, deletedNode.getValue());
    }


}
