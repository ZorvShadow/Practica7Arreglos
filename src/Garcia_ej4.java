public class Garcia_ej4 {
    public static void main(String[] args) {
        // Orden: y, x
        int size_y = 5;
        int size_x = 4;
        int[][] matriz = new int[size_y][size_x];

        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.print(matriz[y][x] + "  ");
            }
            System.out.println();
        }
    }
}
