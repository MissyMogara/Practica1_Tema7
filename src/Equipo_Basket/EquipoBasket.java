package Equipo_Basket;

import java.util.*;

/**
 * This class has every basket player inside.
 */
public class EquipoBasket implements Comparable<EquipoBasket>{
    //PROPERTIES
    private String nombre;
    private Double partidosGanados;
    private Double partidosPerdidos;
    private HashSet<JugadorBasket> jugadores;
    //CONSTRUCTOR
    public EquipoBasket(String nombre, Double partidosGanados, Double partidosPerdidos) {
        this.nombre = nombre;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.jugadores = new HashSet<>(5); //Every match starts with 5 players in each team
    }
    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(Double partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public Double getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(Double partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public HashSet<JugadorBasket> getJugadores() {
        return jugadores;
    }

    //METHODS
    /**
     * This method search for a player by the param name.
     * @param nombre param to search the player.
     * @return object player.
     */
    public JugadorBasket buscarJugador(String nombre){
        //Arraylist from which we are going to search
        List<JugadorBasket> jugadoresBasket = new ArrayList<>(jugadores);
        //Order the arraylist
        //We need a class with comparable interface for order
        Collections.sort(jugadoresBasket);
        //Player what we are going to search
        JugadorBasket jugadorABuscar = new JugadorBasket();
        jugadorABuscar.setNombre(nombre);
        //Now we can search for that player
        //Return the player
        return jugadoresBasket.get(Collections.binarySearch(jugadoresBasket, jugadorABuscar));
    }

    /**
     * This method search for a player by the param dorsal.
     * @param dorsal number of every player.
     * @return object player
     */
    public JugadorBasket buscarJugador(int dorsal){
        //Arraylist from which we are going to search
        List<JugadorBasket> jugadoresBasket = new ArrayList<>(jugadores);
        //Order the arraylist
        //We need a class with comparable interface for order
        Collections.sort(jugadoresBasket);
        //Player what we are going to search
        JugadorBasket jugadorABuscar = new JugadorBasket();
        jugadorABuscar.setDorsal(dorsal);
        //Now we can search for that player
        //Return the player
        return jugadoresBasket.get(Collections.binarySearch(jugadoresBasket, jugadorABuscar));
    }

    /**
     * This method show all the players from the team
     */
    public void mostrarEquipo(){
        this.jugadores.forEach(System.out::println);
    }

    /**
     * This method add a player to hashset
     * @param jugador player object
     */
    public void addJugador(JugadorBasket jugador){
        this.jugadores.add(jugador);
    }

    /**
     * This method remove a player from hashset
     * @param jugador player object
     */
    public void removeJugador(JugadorBasket jugador){
        this.jugadores.remove(jugador);
    }
    //COMPARE TO
    @Override
    public int compareTo(EquipoBasket o){
        return this.nombre.compareTo(o.getNombre());
    }
    //TO STRING
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EquipoBasket{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", partidosGanados=").append(partidosGanados);
        sb.append(", partidosPerdidos=").append(partidosPerdidos);
        sb.append('}');
        return sb.toString();
    }
}
