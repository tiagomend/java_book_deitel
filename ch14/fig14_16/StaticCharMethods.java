package ch14.fig14_16;

import java.util.Scanner;

// Métodos de conversão static da classe Character
public class StaticCharMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtém radical
        System.out.println("Please enter a radix:");
        int radix = scanner.nextInt();

        // Obtém escolha de usuário
        System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n",
            "Convert digit to character", "Convert character to digit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a digit:");
                int digit = scanner.nextInt();
                System.out.printf("Convert digit to character: %s%n",
                    Character.forDigit(digit, radix));
                break;
            case 2:
                System.out.println("Enter a digit:");
                char character = scanner.next().charAt(0);
                System.out.printf("Convert character to digit: %s%n",
                    Character.digit(character, radix));
                break;
        }

        scanner.close();
    }
}
