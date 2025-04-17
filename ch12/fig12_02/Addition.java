// Utilize o argumento CLI -Dswing.defaultlaf=com.sun.java.swing.plaf.windows.WindowsLookAndFeel
import javax.swing.JOptionPane;

// Programa de adiçõa que utiliza JOptionPane para entrada e saída
public class Addition {
    
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");
        int number1 = Integer.parseInt(firstNumber); // converte a string em inteiro
        int number2 = Integer.parseInt(secondNumber); // converte a string em inteiro

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(
            null, // Janela pai
            "The sum is " + sum, // Mensagem a ser exibida
            "Results", // Título da janela
            JOptionPane.PLAIN_MESSAGE); // Tipo de mensagem

        /*
         * ERROR_MESSAGE: Mensagem de erro
         * INFORMATION_MESSAGE: Mensagem de informação
         * QUESTION_MESSAGE: Mensagem de pergunta
         * WARNING_MESSAGE: Mensagem de aviso
         * PLAIN_MESSAGE: Mensagem simples
         */
    }
}
