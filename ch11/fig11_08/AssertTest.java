import java.util.Scanner;

// rodar como: java -ea AssertTest
public class AssertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 10: ");
        int number = input.nextInt();
        // assert that number is between 0 and 10
        assert (number >= 0 && number <= 10) : "Bad number: " + number;
        System.out.println("You entered " + number);

        input.close();
    }
}
