package edu.neu.csye6200.view;

import javax.swing.*;
import java.awt.*;

public class SignUpJPanel extends JPanel {
    /**
     * components
     */
    private static JPanel topJPanel;
    private static JPanel middleJPanel;
    private static JPanel bottomJPanel;
    //components of top JPanel
    private JLabel titleJLabel = new JLabel("Log Up Page");
    //components of middle JPanel
    private JRadioButton adminJRadioButton = new JRadioButton("Admin");
    private JRadioButton teacherJRadioButton = new JRadioButton("Teacher");
    private JRadioButton parentJRadioButton = new JRadioButton("Parent");
    private JLabel usernameJLabel = new JLabel("User Name : ");
    private JTextField usernameJField = new JTextField(20);
    private JLabel passwordJLabel = new JLabel("Password   : ");
    private JPasswordField passwordJField = new JPasswordField(20);
    //components of bottom JPanel
    private JButton submitJButton = new JButton("Submit");

    public SignUpJPanel() {
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
        constraintsForTop.fill = GridBagConstraints.CENTER;
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

        topJPanel.add(Box.createVerticalStrut(10));
        topJPanel.add(titleJLabel);
        topJPanel.add(Box.createVerticalStrut(10));
    }

    private void createMiddlePanel () {
        middleJPanel = new JPanel();
        middleJPanel.setLayout(new BoxLayout(middleJPanel, BoxLayout.Y_AXIS));

        JPanel userJPanel = new JPanel();
        userJPanel.setLayout(new BoxLayout(userJPanel, BoxLayout.X_AXIS));
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(adminJRadioButton);
        buttonGroup.add(teacherJRadioButton);
        buttonGroup.add(parentJRadioButton);
        userJPanel.add(adminJRadioButton);
        userJPanel.add(Box.createHorizontalStrut(10));
        userJPanel.add(teacherJRadioButton);
        userJPanel.add(Box.createHorizontalStrut(10));
        userJPanel.add(parentJRadioButton);

        JPanel usernameJPanel = new JPanel();
        usernameJPanel.setLayout(new BoxLayout(usernameJPanel, BoxLayout.X_AXIS));
        usernameJPanel.add(usernameJLabel);
        usernameJPanel.add(Box.createHorizontalStrut(15));
        usernameJPanel.add(usernameJField);

        JPanel passwordJPanel = new JPanel();
        passwordJPanel.setLayout(new BoxLayout(passwordJPanel, BoxLayout.X_AXIS));
        passwordJPanel.add(passwordJLabel);
        passwordJPanel.add(Box.createHorizontalStrut(15));
        passwordJPanel.add(passwordJField);

        middleJPanel.add(Box.createVerticalStrut(10));
        middleJPanel.add(userJPanel);
        middleJPanel.add(Box.createVerticalStrut(10));
        middleJPanel.add(usernameJPanel);
        middleJPanel.add(Box.createVerticalStrut(10));
        middleJPanel.add(passwordJPanel);
    }

    private void createBottomJPanel () {
        bottomJPanel = new JPanel();
        bottomJPanel.setLayout(new BoxLayout(bottomJPanel, BoxLayout.Y_AXIS));
        bottomJPanel.add(submitJButton);
    }
}
