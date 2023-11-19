import java.util.Scanner;

public class Garcia_ej2 {
    public static int buscarMaxArr(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int indexMax(int[] arr) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }


    public static int buscarArriba(int[] arr, float num) {
        int cantidad = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) cantidad++;
        }
        return cantidad;
    }

    public static float promedioArr(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return (float) suma / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del Obrero: ");
        String nombre = scanner.nextLine();

        int[] producciones = new int[30];

        for (int i = 0; i < producciones.length; i++) {
            System.out.printf("Introduce la producción del día %2s: ", i + 1);
            producciones[i] = scanner.nextInt();
            /* Para probar: producciones[i] = (int) (Math.random() * 200);*/

        }

        float promedio = promedioArr(producciones);
        int diasArriba = buscarArriba(producciones, promedio);
        int cantidadMax = buscarMaxArr(producciones);
        int diaProductivo = indexMax(producciones);

        System.out.println("\n\n--------- Reporte ---------");
        System.out.println("Nombre del obrero: " + nombre);
        for (int i = 0; i < producciones.length; i++) {
            System.out.printf("Producción del día %2s: %6s\n", i + 1, producciones[i]);
        }
        System.out.println("Promedio de producción: " + promedio);
        System.out.println("Total de días arriba del promedio: " + diasArriba);
        System.out.println("Cantidad producida más alta: " + cantidadMax);
        System.out.println("Dia más productivo: " + (diaProductivo + 1));
    }
}
