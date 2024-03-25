package Equipo_Basket;

public class Test {
    public static void main(String[] args) {

        //PLAYERS -- 1
        JugadorBasket jugador = new JugadorBasket();
        jugador.setNombre("Pepe");
        jugador.setDorsal(1);
        jugador.setAltura(2.21);
        JugadorBasket jugador2 = new JugadorBasket();
        jugador2.setNombre("Miqota");
        jugador2.setDorsal(2);
        jugador2.setAltura(2.41);
        JugadorBasket jugador3 = new JugadorBasket();
        jugador3.setNombre("Miqotilla");
        jugador3.setDorsal(3);
        jugador3.setAltura(2.10);
        JugadorBasket jugador4 = new JugadorBasket();
        jugador4.setNombre("Aura");
        jugador4.setDorsal(4);
        jugador4.setAltura(1.90);
        JugadorBasket jugador5 = new JugadorBasket();
        jugador5.setNombre("Vittorio");
        jugador5.setDorsal(5);
        jugador5.setAltura(1.82);
        //PLAYERS -- 2
        JugadorBasket jugador6 = new JugadorBasket();
        jugador6.setNombre("Mikaela");
        jugador6.setDorsal(6);
        jugador6.setAltura(2.61);
        JugadorBasket jugador7 = new JugadorBasket();
        jugador7.setNombre("Nicolas");
        jugador7.setDorsal(7);
        jugador7.setAltura(1.88);
        JugadorBasket jugador8 = new JugadorBasket();
        jugador8.setNombre("David");
        jugador8.setDorsal(8);
        jugador8.setAltura(2.25);
        JugadorBasket jugador9 = new JugadorBasket();
        jugador9.setNombre("Jeff");
        jugador9.setDorsal(9);
        jugador9.setAltura(2.32);
        JugadorBasket jugador10 = new JugadorBasket();
        jugador10.setNombre("Jake");
        jugador10.setDorsal(10);
        jugador10.setAltura(2.26);
        //PLAYERS -- 3
        JugadorBasket jugador11 = new JugadorBasket();
        jugador11.setNombre("Sable");
        jugador11.setDorsal(11);
        jugador11.setAltura(2.28);
        JugadorBasket jugador12 = new JugadorBasket();
        jugador12.setNombre("Oni");
        jugador12.setDorsal(12);
        jugador12.setAltura(2.18);
        JugadorBasket jugador13 = new JugadorBasket();
        jugador13.setNombre("Legion");
        jugador13.setDorsal(13);
        jugador13.setAltura(2.11);
        JugadorBasket jugador14 = new JugadorBasket();
        jugador14.setNombre("Alan");
        jugador14.setDorsal(14);
        jugador14.setAltura(2.36);
        JugadorBasket jugador15 = new JugadorBasket();
        jugador15.setNombre("Saga");
        jugador15.setDorsal(15);
        jugador15.setAltura(2.04);
        //PLAYERS -- 4
        JugadorBasket jugador16 = new JugadorBasket();
        jugador16.setNombre("Bill");
        jugador16.setDorsal(16);
        jugador16.setAltura(2.09);
        JugadorBasket jugador17 = new JugadorBasket();
        jugador17.setNombre("Alonso");
        jugador17.setDorsal(17);
        jugador17.setAltura(2.25);
        JugadorBasket jugador18 = new JugadorBasket();
        jugador18.setNombre("Kepler");
        jugador18.setDorsal(18);
        jugador18.setAltura(2.19);
        JugadorBasket jugador19 = new JugadorBasket();
        jugador19.setNombre("Ada");
        jugador19.setDorsal(19);
        jugador19.setAltura(1.92);
        JugadorBasket jugador20 = new JugadorBasket();
        jugador20.setNombre("Leon");
        jugador20.setDorsal(20);
        jugador20.setAltura(1.89);
        //PLAYERS -- 5
        JugadorBasket jugador21 = new JugadorBasket();
        jugador21.setNombre("Dwight");
        jugador21.setDorsal(21);
        jugador21.setAltura(1.99);
        JugadorBasket jugador22 = new JugadorBasket();
        jugador22.setNombre("Meg");
        jugador22.setDorsal(22);
        jugador22.setAltura(1.97);
        JugadorBasket jugador23 = new JugadorBasket();
        jugador23.setNombre("Claudette");
        jugador23.setDorsal(23);
        jugador23.setAltura(1.96);
        JugadorBasket jugador24 = new JugadorBasket();
        jugador24.setNombre("Chucky");
        jugador24.setDorsal(24);
        jugador24.setAltura(1.94);
        JugadorBasket jugador25 = new JugadorBasket();
        jugador25.setNombre("Wesker");
        jugador25.setDorsal(25);
        jugador25.setAltura(2.31);
        //PLAYERS -- 6
        JugadorBasket jugador26 = new JugadorBasket();
        jugador26.setNombre("Blight");
        jugador26.setDorsal(26);
        jugador26.setAltura(2.27);
        JugadorBasket jugador27 = new JugadorBasket();
        jugador27.setNombre("Nurse");
        jugador27.setDorsal(27);
        jugador27.setAltura(2.28);
        JugadorBasket jugador28 = new JugadorBasket();
        jugador28.setNombre("Billy");
        jugador28.setDorsal(28);
        jugador28.setAltura(2.24);
        JugadorBasket jugador29 = new JugadorBasket();
        jugador29.setNombre("Unknown");
        jugador29.setDorsal(29);
        jugador29.setAltura(2.26);
        JugadorBasket jugador30 = new JugadorBasket();
        jugador30.setNombre("Huntress");
        jugador30.setDorsal(30);
        jugador30.setAltura(2.29);
        //TEAM -- 1
        EquipoBasket equipo1 = new EquipoBasket("Equipo1",7.0,6.0);
        equipo1.addJugador(jugador);
        equipo1.addJugador(jugador2);
        equipo1.addJugador(jugador3);
        equipo1.addJugador(jugador4);
        equipo1.addJugador(jugador5);
        //TEAM -- 2
        EquipoBasket equipo2 = new EquipoBasket("Equipo2",12.0,12.0);
        equipo2.addJugador(jugador6);
        equipo2.addJugador(jugador7);
        equipo2.addJugador(jugador8);
        equipo2.addJugador(jugador9);
        equipo2.addJugador(jugador10);
        //TEAM -- 3
        EquipoBasket equipo3 = new EquipoBasket("Equipo3",13.0,9.0);
        equipo3.addJugador(jugador11);
        equipo3.addJugador(jugador12);
        equipo3.addJugador(jugador13);
        equipo3.addJugador(jugador14);
        equipo3.addJugador(jugador15);
        //TEAM -- 4
        EquipoBasket equipo4 = new EquipoBasket("Equipo4",5.0,8.0);
        equipo4.addJugador(jugador16);
        equipo4.addJugador(jugador17);
        equipo4.addJugador(jugador18);
        equipo4.addJugador(jugador19);
        equipo4.addJugador(jugador20);
        //TEAM -- 5
        EquipoBasket equipo5 = new EquipoBasket("Equipo5",15.0,3.0);
        equipo5.addJugador(jugador21);
        equipo5.addJugador(jugador22);
        equipo5.addJugador(jugador23);
        equipo5.addJugador(jugador24);
        equipo5.addJugador(jugador25);
        //TEAM -- 6
        EquipoBasket equipo6 = new EquipoBasket("Equipo6",4.0,7.0);
        equipo6.addJugador(jugador26);
        equipo6.addJugador(jugador27);
        equipo6.addJugador(jugador28);
        equipo6.addJugador(jugador29);
        equipo6.addJugador(jugador30);
        //NBA League
        NBALeague liga = new NBALeague();
        liga.addEquipo(equipo1);
        liga.addEquipo(equipo2);
        liga.addEquipo(equipo3);
        liga.addEquipo(equipo4);
        liga.addEquipo(equipo5);
        liga.addEquipo(equipo6);
        //TEST
        System.out.println("-----Mostrar Equipos-----");
        liga.mostarEquipos();
        System.out.println("-----Mostrar Equipos Ordenados-----");
        liga.mostarEquipoOrdernado();
        System.out.println("-----Buscar Jugador por nombre-----");
        System.out.println(equipo1.buscarJugador("Miqota"));
        System.out.println("-----Buscar Jugador por dorsal-----");
        System.out.println(equipo1.buscarJugador(1));
        System.out.println("-----Buscar Jugador más alto-----");
        System.out.println(liga.buscarJugadorMasAlto(liga.getTeam()));
        System.out.println("-----Buscar Equipo con mas partidos ganados-----");
        System.out.println(liga.buscarEquipoPartidosGanador(liga.getTeam()));

    }
}
