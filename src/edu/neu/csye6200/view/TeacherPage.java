package edu.neu.csye6200.view;

import javax.swing.*;
import java.awt.*;

public class TeacherPage extends JPanel{
    /**
     * component
     */
    private static JPanel topJPanel;
    private static JPanel middleJPanel;
    private static JPanel bottomJPanel;
    //components of top JPanel
    private JLabel titleJLabel = new JLabel("Welcome Teacher!!");
    private JButton backToLoginPage = new JButton("<< Back to Login Page");
    //components of middle JPanel
    private JButton classroomUsageInfoJButton = new JButton("View Class Assignment Information");

    public TeacherPage () {
        InitData();
        InitView();
        InitFunction();
    }

    private void InitData () {

    }

    private void InitFunction () {

    }

    private void InitView () {
        createTopPanel();
        createMiddlePanel();
        createBottomJPanel();
        setLayout(new GridBagLayout());

        GridBagConstraints constraintsForTop = new GridBagConstraints();
        constraintsForTop.gridx = 0;
        constraintsForTop.gridy = 0;
        constraintsForTop.weightx = 0;
        constraintsForTop.weighty = 0;
        constraintsForTop.fill = GridBagConstraints.HORIZONTAL;
        add(topJPanel, constraintsForTop);

        GridBagConstraints constraintsForMiddle = new GridBagConstraints();
        constraintsForMiddle.gridx = 0;
        constraintsForMiddle.gridy = 1;
        constraintsForMiddle.weightx = 1.0;
        constraintsForMiddle.weighty = 0;
        constraintsForMiddle.fill = GridBagConstraints.CENTER;
        add(middleJPanel, constraintsForMiddle);

        GridBagConstraints constraintsForBottom = new GridBagConstraints();
        constraintsForBottom.gridx = 0;
        constraintsForBottom.gridy = 2;
        constraintsForBottom.weightx = 1.0;
        constraintsForBottom.weighty = 0;
        constraintsForBottom.fill = GridBagConstraints.CENTER;
        add(bottomJPanel, constraintsForBottom);
    }

    private void createTopPanel () {
        topJPanel = new JPanel();
        topJPanel.setLayout(new BoxLayout(topJPanel, BoxLayout.Y_AXIS));

        JPanel backJPanel = new JPanel();
        backJPanel.setLayout(new BoxLayout(backJPanel, BoxLayout.X_AXIS));
        backJPanel.add(backToLoginPage);
        backJPanel.add(Box.createHorizontalGlue());

        JPanel titleJPanel = new JPanel();
        titleJPanel.add(Box.createHorizontalGlue());
        titleJPanel.add(titleJLabel);
        titleJPanel.add(Box.createHorizontalGlue());

        topJPanel.add(Box.createVerticalStrut(10));
        topJPanel.add(backJPanel);
        topJPanel.add(Box.createVerticalStrut(10));
        topJPanel.add(titleJPanel);
    }

    private void createMiddlePanel () {
        middleJPanel = new JPanel();
        middleJPanel.setLayout(new BoxLayout(middleJPanel, BoxLayout.Y_AXIS));
        middleJPanel.add(Box.createVerticalStrut(10));
        middleJPanel.add(classroomUsageInfoJButton);
    }

    private void createBottomJPanel () {
        bottomJPanel = new JPanel();
        bottomJPanel.setLayout(new BoxLayout(bottomJPanel, BoxLayout.Y_AXIS));
        bottomJPanel.add(Box.createVerticalStrut(5));
    }
}
