public class Garcia_ej1 {
    public static int buscarMaxArr(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int largo = 20;
        int[] arr = new int[largo];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.printf("%2s ", arr[i]);
            if (arr[i] % 3 != 0) System.out.print("no ");
            System.out.print("es divisible entre 3\n");
        }

        System.out.print("\nEl número mayor es: " + buscarMaxArr(arr));

    }
}
