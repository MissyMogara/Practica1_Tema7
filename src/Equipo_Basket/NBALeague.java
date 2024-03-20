package Equipo_Basket;

import java.util.*;
import java.util.stream.Stream;

/**
 * This class contains all basket teams.
 */
public class NBALeague {
    //PROPERTIES
    private HashMap<String,EquipoBasket> team;
    private TreeMap<String,EquipoBasket> orderedTeam;
    //CONSTRUCTOR
    public NBALeague() {
        this.team = new HashMap<>();
        this.orderedTeam = new TreeMap<>();
    }
    //GETTERS AND SETTERS

    public HashMap getTeam() {
        return team;
    }

    public TreeMap getOrderedTeam() {
        return orderedTeam;
    }

    //METHODS

    /**
     * This method adds a team to NBALeague
     * @param equipo
     */
    public void addEquipo(EquipoBasket equipo){
        this.team.put(equipo.getNombre(),equipo);
        this.orderedTeam.put(equipo.getNombre(),equipo);
    }

    /**
     * This method removes a team from NBALeague
     * @param nombreEquipo
     */
    public void removeEquipo(String nombreEquipo){
        this.team.remove(nombreEquipo);
        this.orderedTeam.remove(nombreEquipo);
    }

    /**
     * This method print all teams
     */
    public void mostarEquipos(){
        this.team.forEach( (k,v) -> System.out.println(k + ": " + v) );
    }

    /**
     * This method print all teams ordered by name
     */
    public void mostarEquipoOrdernado(){
        this.orderedTeam.forEach( (k,v) -> System.out.println(k + ": " + v) );
    }

    /**
     * This method returns the tallest player.
     * @param team map from NBALeague.
     * @return object player.
     */
    public JugadorBasket buscarJugadorMasAlto(Map<String,EquipoBasket> team){
        //All keys from map team
        Set<String> teams = team.keySet();
        JugadorBasket alto = teams.stream() // Make a stream from teams
                .map( equipo -> team.get(equipo)) // Take every EquipoBasket
                .map( eq -> eq.getJugadores())  // Take every player Set from every team
                .flatMap(eq -> eq.stream()) // Make a stream from every player Set
                .max( (jugador,jugador2) -> jugador.getAltura().compareTo(jugador2.getAltura())) // Compare every player
                .orElseGet(null); // Pick the tallest player or null if not present
        return alto;
    }
}
