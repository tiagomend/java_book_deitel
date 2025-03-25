// Desenhando um arco-iris com arcos e um array de cores
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colors = {
        Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED
    };

    public DrawRainbow(){
        setBackground(Color.WHITE);
    }

    // Desenha um arco-iris utilizando arcos concêntricos
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int radius = 20; // Raio de um arco

        // Desenha o arco perto da parte central inferior
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        // Desenha arcos preenchidos com o mais externo
        for (int counter = colors.length; counter > 0; counter--){
            // Configura a cor para o arco atual
            g.setColor(colors[counter - 1]);

            // Preenche o arco de 0 a 180 graus
            g.fillArc(
                centerX - counter * radius,
                centerY - counter * radius,
                counter * radius * 2,
                counter * radius * 2,
                0, 180);
        }
    }
}