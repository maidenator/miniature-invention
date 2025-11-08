package com.example.library.passwordValidator.forms;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;


public class PasswordValidator extends JFrame {
    private JPanel mainPanel;
    private JPasswordField passwordTextField;
    private JLabel statusLabel;

    public PasswordValidator() {
        setTitle("Password Validation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        passwordTextField.setName("passwordTextField");
        statusLabel.setName("statusLabel");

        statusLabel.setForeground(Color.RED);
        passwordTextField.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                String currentText = passwordTextField.getText();

                if (currentText.length() < 8) {
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("Password must be at least 8 characters long");
                    return;
                }


                if (!currentText.matches(".*\\d.*")) {
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("Password must contain at least one digit");
                    return;
                }

                if (!currentText.matches(".*[^a-zA-Z0-9\\s].*")) {
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("Password must contain at least one special character");
                    return;
                }

                statusLabel.setForeground(Color.GREEN);
                statusLabel.setText("Password is valid");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String currentText = passwordTextField.getText();

                if (currentText.length() < 8) {
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("Password must be at least 8 characters long");
                    return;
                }


                if (!currentText.matches(".*\\d.*")) {
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("Password must contain at least one digit");
                    return;
                }

                if (!currentText.matches(".*[^a-zA-Z0-9\\s].*")) {
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("Password must contain at least one special character");
                    return;
                }

                statusLabel.setForeground(Color.GREEN);
                statusLabel.setText("Password is valid");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
}
