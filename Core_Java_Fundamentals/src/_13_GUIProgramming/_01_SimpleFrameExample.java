package _13_GUIProgramming;

import javax.swing.*;
import java.awt.*;

public class _01_SimpleFrameExample {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

@SuppressWarnings("serial")
class SimpleFrame extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public SimpleFrame() {
        setSize(WIDTH, HEIGHT);
        setTitle("Simple Frame Example");
    }
}
