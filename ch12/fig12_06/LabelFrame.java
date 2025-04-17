// JLabels com texto e icones
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;

public class LabelFrame extends JFrame {
    private final JLabel label1; // JLabel apenas com texto
    private final JLabel label2; // JLabel com texto e ícone
    private final JLabel label3; // JLabel com texto, ícone adicionados

    // Construtor LabelFrame
    public LabelFrame() {
        super("JLabel Test");
        setLayout(new FlowLayout()); // Define o layout do JFrame

        label1 = new JLabel("Label with text only");
        label1.setToolTipText("This is label1"); // Define a dica de ferramenta para label1
        add(label1); // Adiciona label1 ao JFrame

        Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
