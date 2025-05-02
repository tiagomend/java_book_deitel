package ch14.fig14_23;
// Métodos string replaceFirst, replaceAll e split
public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Original String 1: %s%n", firstString);

        // Substitui '*' por '^'
        firstString = firstString.replaceAll("\\*", "^");

        System.out.printf("^ substituted for *: %s%n", firstString);

        // Substitui 'stars' por 'carets'
        firstString = firstString.replaceAll("stars", "carets");

        System.out.printf(
            "\"stars\" substituted for \"carets\": %s%n", firstString);

        // Substitui palavras por 'word'
        firstString = firstString.replaceAll("\\w+", "word");
        System.out.printf(
            "Every word replaced by \"word\": %s%n", firstString);

        System.out.printf("%nOriginal String 2: %s%n", secondString);

        // Substitui os primeiros 3 dígitos por 'digit'
        for (int i = 0; i < 3; i++) {
            secondString = secondString.replaceFirst("\\d", "digit");
        }
        System.out.printf(
            "First three digits replaced by \"digit\": %s%n", secondString);
    }
}
