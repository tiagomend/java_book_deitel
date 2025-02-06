
// Figure 3.12: Dialog1.java
import javax.swing.JOptionPane;

/*
 * O primeiro argumento ajuda o aplicativo Java a determinar onde posicionar
 * a caixa de diálogo [...] refere-se a janela pai e faz o diálogo aparecer
 * centralizado na janela do aplicativo. (p. 72)
 */
public class Dialog1 {
    public static void main(String[] args) {
        // Exibe uma caixa de diálogo com uma mensagem
        JOptionPane.showMessageDialog(null, "Welcome to Java!");
    }
}
