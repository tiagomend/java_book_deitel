// Inicializando os elementos de um array com um inicializador de array

public class InitArray {
    public static void main(String[] args){

        // A lista de inicializador especifica o valor inicial de cada elemento
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}