package hciAct;

import javax.swing.*;

public class Application extends JFrame {
    // create a JFrame that ask for user input
    public Application() {
        // create a JFrame
        JFrame frame = new JFrame("Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // create a new Application
        new Application();
    }
}
