package ch12.fig12_25;
// JList que permite múltiplas seleções
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame{
    private final JList<String> colorJList;
    private final JList<String> copyJList;
    private JButton copyButton; // botão para copiar a seleção
    private static final String[] colorNames = {
            "Black", "Blue", "Cyan", "Dark Gray", "Gray",
            "Green", "Light Gray", "Magenta", "Orange",
            "Pink", "Red", "White", "Yellow"
    };

    // construtor
    public MultipleSelectionFrame() {
        super("Multiple Selection List");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames); // cria a lista de cores
        colorJList.setVisibleRowCount(5); // mostra 5 linhas
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // permite múltiplas seleções
        colorJList.setFont(new Font("Red Hat Display", Font.PLAIN, 14));
        add(new JScrollPane(colorJList)); // adiciona a lista à janela
        
        copyJList = new JList<String>(); // cria a lista de cópias
        copyJList.setFont(new Font("Red Hat Display", Font.PLAIN, 14));

        copyButton = new JButton("Copy >>"); // cria o botão de cópia
        copyButton.addActionListener(event -> {
            // coloca valores selecionados na copyJList
            copyJList.setListData(colorJList.getSelectedValuesList().toArray(new String[0]));
        }); // adiciona o ouvinte de eventos
        copyButton.setFont(new Font("Red Hat Display", Font.PLAIN, 14));
        add(copyButton); // adiciona o botão à janela

        copyJList.setVisibleRowCount(5); // mostra 5 linhas
        copyJList.setFixedCellWidth(100); // largura fixa de 100 pixels
        copyJList.setFixedCellHeight(15); // altura fixa de 15 pixels
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList)); // adiciona a lista de cópias à janela
    }
}
