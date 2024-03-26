package Expediente_Alumnos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Expediente {
    //PROPERTIES
    private Estudiante estudiante;
    public HashSet<NotasCurso> notas;
    private boolean activo;
    //CONSTRUCTOR
    public Expediente(Estudiante estudiante, boolean activo) {
        this.estudiante = estudiante;
        this.notas = new HashSet<>();
        this.activo = activo;
    }
    //GETTERS AND SETTERS
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public HashSet<NotasCurso> getNotas() {
        return notas;
    }
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    //TO STRING
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("estudiante=").append(estudiante);
        sb.append(", notas=").append(notas);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }
    //EQUALS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(estudiante, that.estudiante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estudiante);
    }
    //METHODS

    /**
     * This method adds NotasCurso to notas.
     * @param nc object.
     */
    public void addNotas(NotasCurso nc){
        this.notas.add(nc);
    }

    /**
     * Show all the notas from a student.
     * @param curso Curso.
     * @param etapa EtapaEducativa.
     * @return
     */
    public String mostrarNotas(Curso curso, EtapaEducativa etapa){
        StringBuilder sb = new StringBuilder();

        this.notas.stream()
                .filter(tipoEtapa -> tipoEtapa.getEstapaEducativa().equals(etapa))
                .filter(cursoStream -> cursoStream.getCurso().equals(curso))
                .forEach(nota -> {
                    sb.append(nota.pintar());
                    sb.append("\n");
                });
        return sb.toString();

    }
}
