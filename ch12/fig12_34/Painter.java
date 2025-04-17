package ch12.fig12_34;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter {
    public static void main(String[] args) {
        JFrame application = new JFrame("Paint Panel");
        PaintPanel paintPanel = new PaintPanel(); // Cria um painel de pintura
        application.add(paintPanel, BorderLayout.CENTER); // Adiciona o painel ao JFrame

        application.add(new JLabel("Drag the mouse to paint"), BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 400);
        application.setVisible(true);
    }
}
