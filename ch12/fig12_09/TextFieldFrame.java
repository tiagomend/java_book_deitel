package ch12.fig12_09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame{
    private final JTextField textField1; // campo de texto com tamanho configurado
    private final JTextField textField2; // campo de texto com texto
    private final JTextField textField3; // campo de texto com texto e tamanho
    private final JPasswordField passwordField; // campo de senha com texto

    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        // Cria campo de texto com 10 colunas
        textField1 = new JTextField(10);
        add(textField1);

        // Cria campo de texto com texto padrão
        textField2 = new JTextField("Enter text here");
        add(textField2);

        // Cria campo de texto com texto padrão e 21 colunas
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false); // desativa a edição
        add(textField3);

        // Cria campo de senha com texto padrão
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);

        // Rotinas de tratamento de eventos registradoras
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TextFieldHandler implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";

            // Usuário pressionou Enter no JTextField textField1
            if (event.getSource() == textField1)
                string = String.format("textField1: %s", event.getActionCommand());

            // Usuário pressionou Enter no JTextField textField2
            if (event.getSource() == textField2)
                string = String.format("textField2: %s", event.getActionCommand());

            // Usuário pressionou Enter no JTextField textField3
            if (event.getSource() == textField3)
                string = String.format("textField3: %s", event.getActionCommand());

            // Usuário pressionou Enter no JTextField passwordField
            if (event.getSource() == passwordField)
                string = String.format("passwordField: %s", event.getActionCommand());

            JOptionPane.showMessageDialog(null, string);
        }
    }
}
