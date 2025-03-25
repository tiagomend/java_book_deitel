// Demonstração da coleção ArrayList<T> genérica
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args){
        // Cria um novo ArrayList de strings com uma capacidade inicial de 10
        ArrayList<String> items = new ArrayList<String>();

        items.add("red"); // Anexa um item à lista
        items.add(0, "yellow"); // Insere yellow no indice 0

        System.out.print("Display list contents with counter-controlled loop:");

        // Exibe as cores da lista
        for (int i = 0; i < items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }

        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements:");

        items.remove("yellow"); // Remove o primeiro yellow
        display(items, "Remove first instance of yellow");

        items.remove(1); // Remove o item no índice 1
        display(items, "Remove second list element (green):");

        System.out.printf("\"red\" is %s in the list%n",
            items.contains("red") ? "" : "not ");

        System.out.printf("Size: %s%n", items.size());
    }

    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);

        for (String item : items){
            System.out.printf(" %s", item);
        }

        System.out.println();
    }
}