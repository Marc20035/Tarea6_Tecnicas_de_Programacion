import java.util.Random;

public class TablaAleatoria {

    public static int[] crearTablaAleatoria(int tamano, int minimo, int maximo) {
        int[] tabla = new int[tamano];
        Random rand = new Random();
        for (int i = 0; i < tamano; i++) {
            tabla[i] = rand.nextInt(maximo - minimo + 1) + minimo;
        }
        return tabla;
    }

    public static int encontrarMaximo(int[] tabla) {
        int maximo = tabla[0];
        for (int i = 1; i < tabla.length; i++) {
            if (tabla[i] > maximo) {
                maximo = tabla[i];
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        int[] tabla = crearTablaAleatoria(10, 1, 100);
        System.out.print("La tabla aleatoria es: [ ");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println("]");
        int maximo = encontrarMaximo(tabla);
        System.out.println("El mayor valor de la tabla es: " + maximo);
    }
}
