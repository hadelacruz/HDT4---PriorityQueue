import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BinaryHeapTest {

    BinaryHeap binaryHeap = new BinaryHeap<>();


    @Test
    void insertTest() {
        Paciente paciente1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        Paciente paciente2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente paciente3 = new Paciente("Lorenzo Toledo", "chikungunya", "E");

        binaryHeap.insert(paciente1.getPrioridad(), paciente1);
        binaryHeap.insert(paciente2.getPrioridad(), paciente2);
        binaryHeap.insert(paciente3.getPrioridad(), paciente3);

        assertFalse(binaryHeap.isEmpty());
    }

    @Test
    void deleteTes() {
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
