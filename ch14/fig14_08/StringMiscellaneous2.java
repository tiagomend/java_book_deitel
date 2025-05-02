package ch14.fig14_08;
// Métodos String replace, toLowerCase, toUpperCase, trim e toCharArray
public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "   spaces   ";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

        // Testa o método replace
        System.out.printf(
            "Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));
        
        // Testa o toLowerCase e toUpperCase
        System.out.printf(
            "s1 to lower case: %s%n", s1.toLowerCase());
        System.out.printf(
            "s2 to upper case: %s%n%n", s2.toUpperCase());
        
        // Testa o método trim
        System.out.printf(
            "s3 with spaces removed: %s%n%n", s3.trim());
            
        // Testa o método toCharArray
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array = ");

        for (char character : charArray) {
            System.out.print(character);
        }

        System.out.println();
    }
}
