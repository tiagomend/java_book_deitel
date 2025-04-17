package ch14.fig14_02;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1: %s", s1);

        // Testa o método length
        System.out.printf("%nLength of s1: %d", s1.length());

        // Faz loop pelos caracteres em s1 com charAt e os exibe na ordem inversa
        System.out.printf("%nThe string reversed is: ");

        for (int count = s1.length() - 1; count >= 0; count--){
            System.out.printf("%c ", s1.charAt(count));
        }

        // Copia caracteres a partir de string para charArray
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe caracter array is: ");

        for (char character : charArray)
            System.out.print(character);

        System.out.println();
    }
}
