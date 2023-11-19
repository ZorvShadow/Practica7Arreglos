import java.util.Scanner;

public class Garcia_ej4 {
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

    public static void printMatriz(int[][] arr) {
        int[] sumasCol = new int[arr[0].length];
        int[] sumasRenglon = new int[arr.length];
        for (int y = 0; y < arr.length; y++) {
            int sumaRenglon = 0;


            for (int x = 0; x < arr[y].length; x++) {

                String separador = " | ";
                if (x == arr[y].length - 1) separador = " | Suma: ";

                System.out.printf("%4s", arr[y][x]);
                System.out.print(separador);
                //System.out.print("(x:" + x + ", y:" + +y + ")" + separador);
                sumasRenglon[y] += arr[y][x];
                sumasCol[x] += arr[y][x];
            }
            System.out.println(sumasRenglon[y]);
        }
        System.out.println("\nSuma columnas: ");
        for (int i = 0; i < sumasCol.length; i++) {
            System.out.printf("%4s", sumasCol[i]);
            System.out.print(" | ");
        }

        System.out.println("\nLa suma de columnas mayor es la núm.:  " + (indexMax(sumasCol) + 1));
        System.out.println("La suma de renglones mayor es la núm: " + (indexMax(sumasRenglon) + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Orden: y, x
        int size_y = 5;
        int size_x = 4;
        int[][] matriz = new int[size_y][size_x];


        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.print("Ingresa el número en la posición (x:" + x + ", y:" + +y + "): ");
                matriz[y][x] = (int) (Math.random() * 10);
                System.out.print(matriz[y][x] + "\n");
                //matriz[y][x] = scanner.nextInt();
            }
            System.out.println();
        }

        printMatriz(matriz);
    }
}
