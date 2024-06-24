package gestorbdcurso.modelos;

public class Matricula {
    private int cursoId;
    private String estudianteDNI;
    private String fechaInicio;
    private int calificacion;

    public Matricula() {
    }

    public Matricula(int calificacion, int cursoId, String estudianteDNI, String fechaInicio) {
        this.calificacion = calificacion;
        this.cursoId = cursoId;
        this.estudianteDNI = estudianteDNI;
        this.fechaInicio = fechaInicio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getEstudianteDNI() {
        return estudianteDNI;
    }

    public void setEstudianteDNI(String estudianteDNI) {
        this.estudianteDNI = estudianteDNI;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
