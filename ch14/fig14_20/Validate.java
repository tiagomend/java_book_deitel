package ch14.fig14_20;

import java.util.Scanner;

// Insere e valida os dados do usuário utilizando a classe ValidateInput
public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zip code:");
        String zipCode = scanner.nextLine();
        System.out.println("Please enter phone number:");
        String phone = scanner.nextLine();

        System.out.println("\nValidating input...");

        if (!ValidateInput.validateFirstName(firstName)) {
            System.out.println("Invalid first name.");
        } else if (!ValidateInput.validateLastName(lastName)) {
            System.out.println("Invalid last name.");
        } else if (!ValidateInput.validateAddress(address)) {
            System.out.println("Invalid address.");
        } else if (!ValidateInput.validateCity(city)) {
            System.out.println("Invalid city.");
        } else if (!ValidateInput.validateState(state)) {
            System.out.println("Invalid state.");
        } else if (!ValidateInput.validateZipCode(zipCode)) {
            System.out.println("Invalid zip code.");
        } else if (!ValidateInput.validatePhoneNumber(phone)) {
            System.out.println("Invalid phone number.");
        } else {
            System.out.println("All inputs are valid!");
        }

        scanner.close();
    }
}
