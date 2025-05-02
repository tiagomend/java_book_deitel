package ch14.fig14_18;

import java.util.Scanner;
import java.util.StringTokenizer;

// Objeto StringTokenizer usado para tokenizar string
public class TokenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();

        StringTokenizer tokens = new StringTokenizer(sentence, " ");

        System.out.printf("Number of elements: %d%nThe tokens are:%n",
            tokens.countTokens());

        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }

        scanner.close();
    }
}
