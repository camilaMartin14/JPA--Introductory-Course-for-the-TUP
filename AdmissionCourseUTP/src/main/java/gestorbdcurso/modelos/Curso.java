package gestorbdcurso.modelos;

public class Curso {

    private int id;
    private String nombre;
    private String descripcion;
    private String instructor;
    private int puntajeMinimo;
    private String nivel;
    private String fechaCreacion;

    public Curso() {
    }

    public Curso(int id, String nombre, String descripcion, String instructor, int puntajeMinimo, String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.instructor = instructor;
        this.puntajeMinimo = puntajeMinimo;
        this.nivel = nivel;
        this.fechaCreacion = new java.util.Date().toString();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }
}
