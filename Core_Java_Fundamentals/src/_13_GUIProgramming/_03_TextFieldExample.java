package _13_GUIProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _03_TextFieldExample {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new TextFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class TextFrame extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public TextFrame() {
        setTitle("TextField Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        label = new JLabel("Enter text and press the button:");
        textField = new JTextField(15);
        button = new JButton("Submit");

        button.addActionListener(new TextButtonListener());

        add(label);
        add(textField);
        add(button);
    }

    private class TextButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            JOptionPane.showMessageDialog(TextFrame.this, "You entered: " + text);
        }
    }
}
