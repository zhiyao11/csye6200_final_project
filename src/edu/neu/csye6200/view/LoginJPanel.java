package edu.neu.csye6200.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginJPanel extends JPanel {
    /**
     * components
     */
    private static JPanel topJPanel;
    private static JPanel middleJPanel;
    private static JPanel bottomJPanel;
    //components of top JPanel
    private JLabel titleJLabel = new JLabel("Log In Page");
    //components of middle JPanel
    private JLabel usernameJLabel = new JLabel("User Name : ");
    private JTextField usernameJField = new JTextField(20);
    private JLabel passwordJLabel = new JLabel("Password   : ");
    private JPasswordField passwordJField = new JPasswordField(20);
    //components of bottom JPanel
    private JButton signInJButton = new JButton("Sign In");
    private JLabel signUpIntro = new JLabel("New to our school ?  Please");
    private JButton signUPJButton = new JButton("Sign Up");

    public LoginJPanel () {
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
        middleJPanel.add(usernameJPanel);
        middleJPanel.add(Box.createVerticalStrut(10));
        middleJPanel.add(passwordJPanel);
    }

    private void createBottomJPanel () {
        bottomJPanel = new JPanel();
        bottomJPanel.setLayout(new BoxLayout(bottomJPanel, BoxLayout.Y_AXIS));

        JPanel signInJPanel = new JPanel();
        signInJPanel.setLayout(new BoxLayout(signInJPanel, BoxLayout.X_AXIS));
        signInJPanel.add(Box.createHorizontalGlue());
        signInJPanel.add(signInJButton);

        JPanel signUpJPanel = new JPanel();
        signUpJPanel.setLayout(new BoxLayout(signUpJPanel, BoxLayout.X_AXIS));
        signUpJPanel.add(Box.createHorizontalGlue());
        signUpJPanel.add(signUpIntro);
        signUpJPanel.add(Box.createHorizontalStrut(10));
        signUpJPanel.add(signUPJButton);

        bottomJPanel.add(Box.createVerticalStrut(10));
        bottomJPanel.add(signInJPanel);
        bottomJPanel.add(Box.createVerticalStrut(10));
        bottomJPanel.add(signUpJPanel);
    }
}
