package ch12.fig12_21;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {
    private final JComboBox<String> imagesJComboBox; // contém nomes de ícones
    private final JLabel label; // exibe o icone selecionado

    private static final String[] names = {
        "image1.png", "image2.png", "image3.png", "image4.png"
    };

    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3])),
    };

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<String>(names);
        imagesJComboBox.setMaximumRowCount(3); // exibe 3 linhas

        imagesJComboBox.addItemListener(
            new ItemListener() { // Classe interna anônima
                @Override
                public void itemStateChanged(ItemEvent event){
                    if (event.getStateChange() == ItemEvent.SELECTED)
                        label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                }
            }
        );

        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }
}
