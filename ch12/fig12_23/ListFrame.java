package ch12.fig12_23;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// JList que exibe uma lista de cores
public class ListFrame extends JFrame {
    private final JList<String> colorJList; // lista de cores
    private static final String[] colorNames = { // cores
            "Black", "Blue", "Cyan", "Dark Gray", "Gray",
            "Green", "Light Gray", "Magenta", "Orange",
            "Pink", "Red", "White", "Yellow"
    };
    private static final Color[] colors = { // valores das cores
            Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
            Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
            Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
            Color.YELLOW
    };

    public ListFrame() {
        super("JList Test");
        setLayout(new FlowLayout());

        colorJList = new JList<>(colorNames); // cria a lista de cores
        colorJList.setVisibleRowCount(5); // exibe 5 linhas
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // seleção única

        // adiciona a lista à janela
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(
            new ListSelectionListener() {
                // altera a cor de fundo da janela quando uma cor é selecionada
                public void valueChanged(ListSelectionEvent event) {
                    getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
                }
            }
        );
    }
}
