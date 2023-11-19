import java.util.Scanner;

public class Garcia_ej3 {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidad = 15;

        String[] nombres = new String[cantidad];
        int[] edades = new int[cantidad];
        int[] sueldos = new int[cantidad];

        int sumaSueldos = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Ingresa el nombre del empleado %2s: ", i + 1);
            //nombres[i] = scanner.nextLine();
            nombres[i] = "pepe " + (i + 1);
            System.out.print(nombres[i] + "\n");

            System.out.printf("Ingresa la edad del empleado %2s  : ", i + 1);
            //edades[i] = scanner.nextInt();
            edades[i] = (int) (Math.random() * 70);
            System.out.print(edades[i] + "\n");

            System.out.printf("Ingresa el sueldo del empleado %2s: $", i + 1);
            //sueldos[i] = scanner.nextInt();
            sueldos[i] = (int) (Math.random() * 1_000_000);
            System.out.print(sueldos[i] + "\n");

            sumaSueldos += sueldos[i];
            System.out.println();
        }

        System.out.println("---- Reporte de empleados ----");
        System.out.printf("%10s %6s %8s\n", "Nombre", "Edad", "Sueldo");
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%10s %6s %8s\n", nombres[i], edades[i], "$" + sueldos[i]);
        }
        System.out.println("Total: $" + sumaSueldos);
        System.out.println("Empleado con mayor sueldo: " + nombres[indexMax(sueldos)]);
    }
}
