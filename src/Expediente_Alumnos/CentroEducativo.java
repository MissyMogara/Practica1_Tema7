package Expediente_Alumnos;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class CentroEducativo {
    //PROPERTIES
    private TreeSet<Expediente> expedientes;
    private String nombreCentro;
    private String direccion;
    private String localidad;
    private Long telefono;
    private String email;
    //CONSTRUCTOR
    public CentroEducativo(String nombreCentro, String direccion, String localidad, Long telefono, String email) {
        this.nombreCentro = nombreCentro;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.email = email;
        this.expedientes = new TreeSet<>((expediente1,expediente2) -> expediente1.getEstudiante().getDni()
                .compareTo(expediente2.getEstudiante().getDni()));
    }
    //GETTERS AND SETTERS

    public TreeSet<Expediente> getExpedientes() {
        return expedientes;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //TO STRING
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CentroEducativo{");
        sb.append("expedientes=").append(expedientes);
        sb.append(", nombreCentro='").append(nombreCentro).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
    //EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CentroEducativo that = (CentroEducativo) o;
        return Objects.equals(nombreCentro, that.nombreCentro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCentro);
    }
    //METHODS

    /**
     * This method adds an Expediente to TreeSet expedientes.
     * @param e Expediente.
     */
    public void addExpediente(Expediente e){
        this.expedientes.add(e);
    }

    /**
     * Show all the students notes.
     * @param dni Student dni.
     * @return String.
     */
    public String buscarExpediente(String dni){
        StringBuffer sb = new StringBuffer();
        this.expedientes.stream()
                .filter(exp -> exp.getEstudiante().getDni().equals(dni))
                .forEach(nota -> {
                    sb.append(nota.getNotas());
                    sb.append("\n");
                });
        return sb.toString();
    }
}
