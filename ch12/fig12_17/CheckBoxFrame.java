package ch12.fig12_17;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {
    private final JTextField textField; // Exibe o texto na alteração de fontes
    private final JCheckBox boldJCheckBox; // Marcar estilo negrito
    private final JCheckBox italiJCheckBox; // Marcar estilo italico

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Red Hat Display", Font.PLAIN, 14));
        add(textField);

        boldJCheckBox = new JCheckBox("Bold");
        italiJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox);
        add(italiJCheckBox);

        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italiJCheckBox.addItemListener(handler);

    }

    private class CheckBoxHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event){
            Font font = null;

            if (boldJCheckBox.isSelected() && italiJCheckBox.isSelected())
                font = new Font("Red Hat Display", Font.BOLD + Font.ITALIC, 14);
            else if (boldJCheckBox.isSelected())
                font = new Font("Red Hat Display", Font.BOLD, 14);
            else if (italiJCheckBox.isSelected())
                font = new Font("Red Hat Display", Font.ITALIC, 14);
            else
                font = new Font("Red Hat Display", Font.PLAIN, 14);

            textField.setFont(font);
        }
    }
}
