package ch14.fig14_06;
// Métodos substring da classe String
public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";

        System.out.printf("Substring from index 20 to end is \"%s\"%n",
            letters.substring(20));
        System.out.printf("%s \"%s\"%n",
            "Substring from index 3 up to, but not including 6 is \"%s\"%n",
            letters.substring(3, 6));
    }
}
