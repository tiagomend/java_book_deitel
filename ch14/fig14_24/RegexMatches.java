package ch14.fig14_24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Classes Pattern e Matcher
public class RegexMatches {
    public static void main(String[] args) {
        /*
         *  Cria expressão regular
         * 
         *  J.*\\d[0-35-9]-\\d\\d-\\d\\d -> J seguido de qualquer caractere (exceto nova linha),
         *  seguido de um dígito entre 0 e 3 ou 5 a 9, seguido de um hífen,
         *  seguido de dois dígitos, seguido de um hífen, seguido de dois dígitos 
         */
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");

        String string1 = "Jane's Birthday is 05-12-75\n" +
                "Dave's Birthday is 11-04-68\n" +
                "John's Birthday is 04-28-73\n" +
                "Joe's Birthday is 12-17-77\n";
        
        // corresponde expressão regular à string e imprime as correspondências
        Matcher matcher = expression.matcher(string1);

        /*
         *  O método find() procura a próxima correspondência na string.
         */
        while (matcher.find()) {
            /*
             * O método group() retorna a correspondência encontrada.
             * O método start() retorna o índice inicial da correspondência.
             * O método end() retorna o índice final da correspondência.
             */
            System.out.println(matcher.group());
        }
    }
}
