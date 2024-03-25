package Equipo_Basket;

import java.util.Objects;

/**
 * This class contains all attributes for each basket player
 */
public class JugadorBasket implements Comparable<JugadorBasket> { //Implements comparable interface
    //PROPERTIES
    private String nombre;
    private Double altura;
    private String posicion;
    private Integer dorsal;
    private Double puntosPorPartido;
    private Double rebotesPorPartida;
    private Double taponesPorPartido;
    private Double asistenciasPorPartido;
    private Double robosPorPartido;
    //CONSTRUCTOR

    public JugadorBasket() {

    }
    public JugadorBasket(String nombre, Double altura, String posicion, Integer dorsal, Double puntosPorPartido,
                         Double rebotesPorPartida, Double taponesPorPartido, Double asistenciasPorPartido,
                         Double robosPorPartido) {
        this.nombre = nombre;
        this.altura = altura;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.puntosPorPartido = puntosPorPartido;
        this.rebotesPorPartida = rebotesPorPartida;
        this.taponesPorPartido = taponesPorPartido;
        this.asistenciasPorPartido = asistenciasPorPartido;
        this.robosPorPartido = robosPorPartido;
    }
    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public Double getPuntosPorPartido() {
        return puntosPorPartido;
    }

    public void setPuntosPorPartido(Double puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public Double getRebotesPorPartida() {
        return rebotesPorPartida;
    }

    public void setRebotesPorPartida(Double rebotesPorPartida) {
        this.rebotesPorPartida = rebotesPorPartida;
    }

    public Double getTaponesPorPartido() {
        return taponesPorPartido;
    }

    public void setTaponesPorPartido(Double taponesPorPartido) {
        this.taponesPorPartido = taponesPorPartido;
    }

    public Double getAsistenciasPorPartido() {
        return asistenciasPorPartido;
    }

    public void setAsistenciasPorPartido(Double asistenciasPorPartido) {
        this.asistenciasPorPartido = asistenciasPorPartido;
    }

    public Double getRobosPorPartido() {
        return robosPorPartido;
    }

    public void setRobosPorPartido(Double robosPorPartido) {
        this.robosPorPartido = robosPorPartido;
    }
    //TO STRING
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipo_Basket.JugadorBasket{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", altura=").append(altura);
        sb.append(", posicion='").append(posicion).append('\'');
        sb.append(", dorsal=").append(dorsal);
        sb.append(", puntosPorPartido=").append(puntosPorPartido);
        sb.append(", rebotesPorPartida=").append(rebotesPorPartida);
        sb.append(", taponesPorPartido=").append(taponesPorPartido);
        sb.append(", asistenciasPorPartido=").append(asistenciasPorPartido);
        sb.append(", robosPorPartido=").append(robosPorPartido);
        sb.append('}');
        return sb.toString();
    }
    //EQUALS
    /* With this equal we are going to compare each player with their name */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JugadorBasket that = (JugadorBasket) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    //COMPARE TO
    @Override
    public int compareTo(JugadorBasket o) {
        return this.nombre.compareTo(o.getNombre());
    }

}