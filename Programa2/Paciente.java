public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String prioridad;


    /**
     * @param nombre Nombre del paciente
     * @param sintoma Sintoma del paciente
     * @param prioridad Prioridad del paciente (A,B,C,D,E)
     */
    public Paciente(String nombre, String sintoma, String prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }

    // Comparador basado en la prioridad del paciente
    @Override
    public int compareTo(Paciente otroPaciente) {
        return this.prioridad.compareTo(otroPaciente.prioridad);
    }

    /**
     * Método para obtener el nombre del paciente.
     * 
     * @return Nombre del paciente.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método para establecer el nombre del paciente.
     * 
     * @param nombre Nuevo nombre del paciente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el síntoma del paciente.
     * 
     * @return Síntoma del paciente.
     */
    public String getSintoma() {
        return this.sintoma;
    }

    /**
     * Método para establecer el síntoma del paciente.
     * 
     * @param sintoma Nuevo síntoma del paciente.
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * Método para obtener la prioridad del paciente.
     * 
     * @return Prioridad del paciente (A, B, C, D, E).
     */
    public String getPrioridad() {
        return this.prioridad;
    }

    /**
     * Método para establecer la prioridad del paciente.
     * 
     * @param prioridad Nueva prioridad del paciente (A, B, C, D, E).
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
