/**
 * @author Humberto Alexander de la Cruz Chanchavac
 * @version 1.0 2/04/2024
 * @Description Colas de prioridad con un Arbol Binario, donde los pacientes con prioridad alta salen primero
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap<>();

        try {
            File archivo = new File("pacientes.txt");
            Scanner scanner = new Scanner(archivo);
            
            while (scanner.hasNextLine()) {
                // Lee la línea
                String linea = scanner.nextLine();
                
                // Divide la línea en el formato de nombre, sintoma y prioridad
                String[] partes = linea.split(",");
                
                String nombre = partes[0].trim();
                String sintoma = partes[1].trim();
                String prioridad = partes[2].trim();
                Paciente paciente = new Paciente(nombre ,sintoma, prioridad);
                
                // Insertar los pacientes por prioridad
                binaryHeap.insert(prioridad, paciente);
            }


            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }

        // Eliminar e imprimir los pacientes por prioridad
        System.out.println("--------------PACIENTES POR PRIORIDAD--------------");
        while (!binaryHeap.isEmpty()) {
            Node<String, Paciente> minNode = binaryHeap.delete();
            System.out.println("* " + minNode.getValue().getNombre() +", " + minNode.getValue().getSintoma() + ", " + minNode.getValue().getPrioridad());
        }
    }
}
