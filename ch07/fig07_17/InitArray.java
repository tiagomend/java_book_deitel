// Inicializando arrays bidimensionais
public class InitArray {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1); // Exibe array1 por linha

        System.out.println("Values in array2 by row are");
        outputArray(array2); // Exibe array1 por linha
    }

    public static void outputArray(int[][] array){
        for(int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println();
        }
    }
}
