import java.util.Scanner;

// Classe driver (ou 'classe condutora') [...] (p. 59)
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // new Account() -> expressão de criação de instância de classe. (p. 60)
        // Account() representam uma chamada para um construtor. (p. 60)
        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name: ");

        String name = input.nextLine(); // Lê os caracteres até encontrar nova linha "\n"
        myAccount.setName(name);
        System.out.println();
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());

        input.close();
    }
}
