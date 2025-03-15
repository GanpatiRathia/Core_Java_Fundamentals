package _13_GUIProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _02_ButtonExample {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new ButtonFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class ButtonFrame extends JFrame {
    private JButton button;

    public ButtonFrame() {
        setTitle("Button Example");
        setSize(400, 300);

        button = new JButton("Click Me");
        button.addActionListener(new ButtonClickListener());

        add(button, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this, "Button Clicked!");
        }
    }
}
