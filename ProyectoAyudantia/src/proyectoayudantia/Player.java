package proyectoayudantia;

import java.util.Scanner;

public class Player {

    public Player() {

    }

    public static String[] NombreJugadores(int cantidad) {
        String[] nombreJugadores = new String[cantidad];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese nombre del jugador " + (i + 1));
            nombreJugadores[i] = leer.next();
        }
        return nombreJugadores;
    }

    public static int[] saludJugadores(int cantidad) {
        int[] saludJugadores = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            saludJugadores[i] = 15;
        }
        return saludJugadores;
    }

    public static int[] posicionJugadores(int cantidad) {
        int[] posicionJugadores = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            posicionJugadores[i] = 0;
        }
        return posicionJugadores;
    }

    public static void meditar() {

    }

}
