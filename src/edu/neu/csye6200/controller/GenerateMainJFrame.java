package edu.neu.csye6200.controller;

import javax.swing.*;

public class GenerateMainJFrame extends JFrame {
    public void init (JPanel jPanel) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel.setOpaque(true);
        setBounds(400, 100, 800, 800);
        getContentPane().add(jPanel);
        setVisible(true);
    }
}
