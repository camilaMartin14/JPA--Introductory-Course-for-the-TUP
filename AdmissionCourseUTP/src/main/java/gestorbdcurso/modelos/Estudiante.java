package gestorbdcurso.modelos;

public class Estudiante {

    private int dni;
    private String nombreCompleto;
    private String email;
    private String especialidad;
    private String fechaInscripcion;

    public Estudiante() {
    }

    public Estudiante(int dni, String email, String especialidad, String fechaInscripcion, String nombreCompleto) {
        this.dni = dni;
        this.email = email;
        this.especialidad = especialidad;
        this.fechaInscripcion = fechaInscripcion;
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
