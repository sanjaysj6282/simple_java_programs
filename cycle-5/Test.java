// Create a GUI window using swings

import javax.swing.*;
public class Test extends JFrame {
    public Test() {
        super("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new JLabel("Test, Application!"));
        pack();
        setVisible(true);
    }
    public static void main(final String[] args) {
        new Test();
    }
}