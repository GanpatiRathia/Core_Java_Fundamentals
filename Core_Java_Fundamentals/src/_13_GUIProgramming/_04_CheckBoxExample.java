package _13_GUIProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _04_CheckBoxExample {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new CheckBoxFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class CheckBoxFrame extends JFrame {
    private JCheckBox checkBox;
    private JLabel label;

    public CheckBoxFrame() {
        setTitle("CheckBox Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        checkBox = new JCheckBox("Check Me");
        label = new JLabel("Checkbox is unchecked.");

        checkBox.addActionListener(new CheckBoxListener());

        add(checkBox);
        add(label);
    }

    private class CheckBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (checkBox.isSelected()) {
                label.setText("Checkbox is checked!");
            } else {
                label.setText("Checkbox is unchecked.");
            }
        }
    }
}
