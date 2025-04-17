package ch12.fig12_39;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {
    
    private final JButton leftButton;
    private final JButton centerButton;
    private final JButton rightButton;

    private final FlowLayout layout;
    private final Container container;

    public FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        leftButton = new JButton("Left");
        add(leftButton);
        leftButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    // Método para mudar o alinhamento do FlowLayout
                    layout.setAlignment(FlowLayout.LEFT);

                    // Especifica o JFrame que deve ser reorganizado
                    layout.layoutContainer(container);
                }
            }
        );

        centerButton = new JButton("Center");
        add(centerButton);
        centerButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.CENTER);
                    layout.layoutContainer(container);
                }
            }
        );

        rightButton = new JButton("Right");
        add(rightButton);
        rightButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.RIGHT);
                    layout.layoutContainer(container);
                }
            }
        );
    }
}
