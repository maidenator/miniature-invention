package com.example.library.numberCounter.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCounter extends JFrame {
    private JPanel mainPanel;
    private JButton decreaseButton;
    private JButton increaseButton;
    private JLabel countLabel;

    public NumberCounter() {
        setTitle("Number Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        decreaseButton.setName("decreaseButton");
        increaseButton.setName("increaseButton");
        countLabel.setName("countLabel");

        increaseButton.addActionListener(e -> countLabel.setText(String.valueOf(Integer.parseInt(countLabel.getText()) + 1)));
        decreaseButton.addActionListener(e -> countLabel.setText(String.valueOf(Integer.parseInt(countLabel.getText()) - 1)));
    }
}
