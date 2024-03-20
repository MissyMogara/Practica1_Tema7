package Equipo_Basket;

public class Test {
    public static void main(String[] args) {

        JugadorBasket jugador = new JugadorBasket();
        jugador.setNombre("Pepe");
        JugadorBasket jugador2 = new JugadorBasket();
        jugador2.setNombre("Miqota");
        JugadorBasket jugador3 = new JugadorBasket();
        jugador3.setNombre("Miqotilla");
        JugadorBasket jugador4 = new JugadorBasket();
        jugador4.setNombre("Aura");
        JugadorBasket jugador5 = new JugadorBasket();
        jugador5.setNombre("XD");

        EquipoBasket equipo = new EquipoBasket("Nombre",12.0,12.0);
        equipo.addJugador(jugador);
        equipo.addJugador(jugador2);
        equipo.addJugador(jugador3);
        equipo.addJugador(jugador4);
        equipo.addJugador(jugador5);

        equipo.mostrarEquipo();

        NBALeague liga = new NBALeague();
        liga.addEquipo(equipo);

        liga.mostarEquipos();

    }
}
