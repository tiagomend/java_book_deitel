import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        // Configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel); // Adiciona o painel ao frame
        application.setSize(250, 250); // Configura o tamanho do frame
        application.setVisible(true); // Torna o frame visível
    }
}
