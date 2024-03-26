package Expediente_Alumnos;

import java.time.LocalDate;
import java.util.Objects;

public class Estudiante {
    //PROPERTIES
    private String dni;
    private String nombre;
    private String apellidos;
    private LocalDate fnacimiento;
    private String direccion;
    private String email;
    private String localidad;
    private Long telefono;
    //CONSTRUCTOR
    public Estudiante(String dni, String nombre, String apellidos, LocalDate fnacimiento, String direccion,
                      String email, String localidad, Long telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fnacimiento = fnacimiento;
        this.direccion = direccion;
        this.email = email;
        this.localidad = localidad;
        this.telefono = telefono;
    }
    //GETTER AND SETTERS

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(LocalDate fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    //TO STRING

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Estudiante{");
        sb.append("dni=").append(dni);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", fnacimiento=").append(fnacimiento);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    //EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
