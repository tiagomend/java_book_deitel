public class BarChart {
    public static void main(String[] args){
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.println("Grade distribution:");

        for (int counter = 0; counter < array.length; counter++){
            
            // Gera saída do rótulo de barra
            if (counter == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);

            // Imprime a barra de asteriscos
            for (int stars = 0; stars < array[counter]; stars++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}