import java.util.Scanner;

public class Garcia_ej5 {
    public static int indexMax(int[][] arr) {
        int max = 0;
        int index = 0;

        int[] sumaProd = new int[arr[0].length];
        for (int turno = 0; turno < arr.length; turno++) {
            for (int i = 0; i < arr[turno].length; i++) {
                sumaProd[i] += arr[turno][i];
            }
        }

        for (int i = 0; i < sumaProd.length; i++) {
            if (sumaProd[i] > max) {
                max = sumaProd[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largo = 10;
        int turnos = 3;
        String[] nombreProductos = new String[largo];
        int[][] produccionPorTurno = new int[turnos][largo];


        for (int i = 0; i < largo; i++) {
            System.out.printf("Introduce el nombre del artículo %d: ", i + 1);
            nombreProductos[i] = scanner.nextLine();
            /*nombreProductos[i] = "art" + (i + 1);
            System.out.println(nombreProductos[i]);*/

            for (int turno = 0; turno < turnos; turno++) {
                System.out.printf("Introduce la produccion del artículo %d en el turno %d: ", i + 1, turno + 1);
                produccionPorTurno[turno][i] = scanner.nextInt();
                /*produccionPorTurno[turno][i] = (int) (Math.random() * 999);
                System.out.println(produccionPorTurno[turno][i]);*/
            }
            System.out.println();
        }

        System.out.println("-------------- Reporte diario de producción --------------");
        System.out.printf("%-20s %-8s %-8s %-8s %-10s\n", "Articulo", "Turno 1", "Turno 2", "Turno 3", "Tot. Prod.");
        for (int i = 0; i < largo; i++) {
            System.out.printf("%-20s %-8s %-8s %-8s %-10s\n", nombreProductos[i], produccionPorTurno[0][i],
                    produccionPorTurno[1][i], produccionPorTurno[2][i],
                    produccionPorTurno[0][i] + produccionPorTurno[1][i] + produccionPorTurno[2][i]);

        }
        int indiceMayor = indexMax(produccionPorTurno);
        System.out.printf("Artículo con mayor producción: %s\n", nombreProductos[indiceMayor]);
        System.out.printf("Producción del artículo mayor: %s\n", produccionPorTurno[0][indiceMayor] + produccionPorTurno[1][indiceMayor] + produccionPorTurno[2][indiceMayor]);
    }
}

