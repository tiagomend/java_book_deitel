package ch12.fig12_34;

import java.util.ArrayList;

import javax.swing.JPanel;

import java.awt.event.MouseMotionAdapter;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;


// Classe de adaptadores utilizada para implementar rotinas de tratamento de eventos
public class PaintPanel extends  JPanel {
    private final ArrayList<Point> points = new ArrayList<>();

    public PaintPanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent event) {
                points.add(event.getPoint());
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // Desenha todos os pontos armazenados na lista
        for (Point point : points) {
            // Desenha um ponto na posição (x, y)
            g.fillOval(point.x, point.y, 10, 10);
        }
    }
    
}
