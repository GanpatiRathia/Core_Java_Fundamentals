package _13_GUIProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _05_RadioButtonExample {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new RadioButtonFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class RadioButtonFrame extends JFrame {
    private JRadioButton option1, option2;
    private ButtonGroup group;
    private JLabel label;

    public RadioButtonFrame() {
        setTitle("Radio Button Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        option1 = new JRadioButton("Option 1");
        option2 = new JRadioButton("Option 2");
        group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        label = new JLabel("Select an option");

        option1.addActionListener(new RadioButtonListener());
        option2.addActionListener(new RadioButtonListener());

        add(option1);
        add(option2);
        add(label);
    }

    private class RadioButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Selected: " + ((JRadioButton) e.getSource()).getText());
        }
    }
}
