package ch12.fig12_15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
    private final JButton plainJButton;
    private final JButton fancyJButton; // Botão com ícones
    
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("bug1.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.png"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);

        // Tratador de evento
        ButtonHandler handler = new ButtonHandler();
        plainJButton.addActionListener(handler);
        fancyJButton.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                "You pressed: %s", event.getActionCommand()));
        }
    }
}