import java.util.Random;
import java.util.Scanner;

public class BatallaNaval {

    // Definición de procedimientos
    public static char[][] inicializarTablero() {
        char[][] tablero = {{'O', 'O', 'O', 'O'},
                            {'O', 'O', 'O', 'O'},
                            {'O', 'O', 'O', 'O'},
                            {'O', 'O', 'O', 'O'}};
        return tablero;
    }

    public static void mostrarTablero(char[][] tablero) {
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public static int introducirEnteroEntreLimites(String mensaje, int minimo, int maximo) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.print(mensaje);
                sc.next();
            }
            valor = sc.nextInt();
        } while (valor < minimo || valor > maximo);
        return valor;
    }

    public static boolean disparar(char[][] tablero, int fila, int columna) {
        if (tablero[fila][columna] == 'X') {
            return true;
        } else {
            tablero[fila][columna] = '.';
            return false;
        }
    }

    // Algoritmo principal
    public static void main(String[] args) {
        char[][] tablero = inicializarTablero();
        Random rand = new Random();
        int filaBarco = rand.nextInt(4);
        int columnaBarco = rand.nextInt(4);
        tablero[filaBarco][columnaBarco] = 'X';
        int intentos = 0;
        System.out.println("Bienvenido a la guerra de barcos!");
        while (true) {
            mostrarTablero(tablero);
            int fila = introducirEnteroEntreLimites("Ingresa la fila (0-3): ", 0, 3);
            int columna = introducirEnteroEntreLimites("Ingresa la columna (0-3): ", 0, 3);
            if (disparar(tablero, fila, columna)) {
                System.out.println("¡Felicidades! ¡Hundiste el barco en " + (intentos+1) + " intentos!");
                break;
            } else {
                System.out.println("Agua. ¡Inténtalo de nuevo!");
                intentos++;
                if (intentos >= 10) {
                    System.out.println("Lo siento, has agotado tus intentos.");
                    break;
                }
            }
        }
    }
}
