import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap<>();
        try {
            
            File archivo = new File("pacientes.txt");
            Scanner scanner = new Scanner(archivo);

            // Itera sobre cada línea del archivo
            while (scanner.hasNextLine()) {
                // Lee la línea
                String linea = scanner.nextLine();
                
                // Divide la línea en el formato de nombre, sintoma y prioridad
                String[] partes = linea.split(",");
                
                String nombre = partes[0].trim();
                String sintoma = partes[1].trim();
                String prioridad = partes[2].trim();
                Paciente paciente = new Paciente(nombre ,sintoma, prioridad);
                
                // Insertar el Nodo en BynaryHeap
                binaryHeap.insert(prioridad,paciente);
            }


            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
