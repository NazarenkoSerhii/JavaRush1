package ModTwoGuiAndSwing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My first GUI");
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,400);
        jFrame.setLocationRelativeTo(null);

        jFrame.setVisible(true);

        JButton jButtonStart = new JButton("Start");
        jFrame.getContentPane().add(jButtonStart);

        JButton jButtonStop = new JButton("Stop");
        jFrame.getContentPane().add(jButtonStop);


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(jButtonStart);
        buttonPanel.add(jButtonStop);

        jFrame.add(BorderLayout.NORTH,buttonPanel);
    }
}
