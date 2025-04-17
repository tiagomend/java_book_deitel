package ch12.fig12_39;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TabelaExemplo extends JFrame {

    public TabelaExemplo() {
        setTitle("Exemplo de JTable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(600, 300));

        // Cabeçalhos das colunas
        String[] colunas = {"ID", "Nome", "E-mail"};

        // Dados de exemplo
        Object[][] dados = {
            {1, "Tiago", "tiago@exemplo.com"},
            {2, "Joana", "joana@exemplo.com"},
            {3, "Carlos", "carlos@exemplo.com"}
        };

        // Modelo padrão de tabela
        DefaultTableModel model = new DefaultTableModel(dados, colunas);

        // Cria a JTable com o modelo
        JTable tabela = new JTable(model);

        // Coloca a tabela dentro de um JScrollPane para rolagem
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TabelaExemplo().setVisible(true);
        });
    }
}

