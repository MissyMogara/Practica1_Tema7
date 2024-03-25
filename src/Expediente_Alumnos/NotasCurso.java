package Expediente_Alumnos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

public class NotasCurso {
    //PROPERTIES
    public Estapa_Educativa estapaEducativa;
    private String nombreCiclo;
    public Curso curso;
    private HashMap<String,Double> notas; //Subject and grade
    private LocalDate anio;
    //CONSTRUTOR
    public NotasCurso(Estapa_Educativa estapaEducativa, String nombreCiclo, Curso curso, HashMap<String, Double> notas,
                      LocalDate anio) {
        this.estapaEducativa = estapaEducativa;
        this.nombreCiclo = nombreCiclo;
        this.curso = curso;
        this.notas = notas;
        this.anio = anio;
    }
    //GETTERS AND SETTERS

    public Estapa_Educativa getEstapaEducativa() {
        return estapaEducativa;
    }

    public void setEstapaEducativa(Estapa_Educativa estapaEducativa) {
        this.estapaEducativa = estapaEducativa;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public HashMap<String, Double> getNotas() {
        return notas;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }
    //TO STRING
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotasCurso{");
        sb.append("estapaEducativa=").append(estapaEducativa);
        sb.append(", nombreCiclo='").append(nombreCiclo).append('\'');
        sb.append(", curso=").append(curso);
        sb.append(", notas=").append(notas);
        sb.append(", anio=").append(anio);
        sb.append('}');
        return sb.toString();
    }
    //EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return estapaEducativa == that.estapaEducativa && Objects.equals(nombreCiclo, that.nombreCiclo)
                && curso == that.curso && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estapaEducativa, nombreCiclo, curso, anio);
    }
    //METHODS

    /**
     * This method adds a subject and a grade.
     * @param asignatura name of the subject.
     * @param nota grade.
     */
    public void addNota(String asignatura, Double nota){
        this.notas.put(asignatura,nota);
    }

    /**
     * This method deletes a subject from HashMap.
     * @param asignatura name of the subject.
     */
    public void deleteNota(String asignatura){
        this.notas.remove(asignatura);
    }
    public Double buscar(String asignatura){
        Double nota = this.notas.keySet().stream()

    }
}
