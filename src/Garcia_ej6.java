import java.util.Scanner;

public class Garcia_ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largo = 3;
        int[][] matriz = new int[largo][largo];

        int[] sumaCols = new int[largo];
        int[] sumaFilas = new int[largo];
        int sumaDiags1 = 0;
        int sumaDiags2 = 0;

        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("Ingrese el valor en posición (%2d, %-2d): ", x, y);
                matriz[y][x] = scanner.nextInt();
            }
        }
        System.out.println("\nTu cuadrado es el siguiente: ");
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.print(matriz[y][x] + " ");
                //System.out.printf("(%2d, %-2d )| ", x, y);
                sumaCols[x] += matriz[y][x];
                sumaFilas[y] += matriz[y][x];

                if (y == x) {
                    sumaDiags1 += matriz[y][x];
                }

                if (y + x == largo - 1) {
                    sumaDiags2 += matriz[y][x];

                }
            }
            System.out.println();
        }
        boolean magico = true;

        for (int i = 0; i < sumaCols.length; i++) {
            if (sumaCols[i] != 15) {
                magico = false;
                break;
            }
        }

        for (int i = 0; i < sumaFilas.length; i++) {
            if (sumaFilas[i] != 15) {
                magico = false;
                break;
            }
        }
        if (sumaDiags1 != sumaDiags2 && sumaDiags1 != 15) magico = false;

        String prefijo = "";
        if (!magico) prefijo = " no";

        System.out.printf("Tu cuadrado%s es mágico", prefijo);
    }
}
