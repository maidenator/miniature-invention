package com.example.library.pizzaOrderSystem.forms;

import javax.swing.*;

public class PizzaOrderSystem extends JFrame {
    private JPanel mainPanel;
    private JButton calculateButton;
    private JComboBox pizzaSizeChoice;
    private JComboBox extraCheeseChoice;
    private JLabel totalLabel;
    private JCheckBox mushroomsCheckBox;
    private JCheckBox pepperoniCheckBox;
    private JCheckBox onionCheckBox;

    public PizzaOrderSystem() {
        setTitle("Pizza Order System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        calculateButton.setName("calculateButton");
        pizzaSizeChoice.setName("pizzaSizeChoice");
        mushroomsCheckBox.setName("mushroomsCheckBox");
        pepperoniCheckBox.setName("pepperoniCheckBox");
        onionCheckBox.setName("onionCheckBox");
        extraCheeseChoice.setName("extraCheeseChoice");
        totalLabel.setName("totalLabel");

        calculateButton.addActionListener(e -> calculateTotal());

    }

    private void calculateTotal() {
        int currentTotal = 0;

        int sizeChoice = pizzaSizeChoice.getSelectedIndex();
        if(sizeChoice == 0){
            currentTotal += 10;
        } else if(sizeChoice == 1){
            currentTotal += 15;
        } else if(sizeChoice == 2){
            currentTotal += 20;
        }

        final int TOPPING_COST = 2;
        if(mushroomsCheckBox.isSelected()){
            currentTotal += TOPPING_COST;
        }
        if(pepperoniCheckBox.isSelected()){
            currentTotal += TOPPING_COST;
        }
        if(onionCheckBox.isSelected()){
            currentTotal += TOPPING_COST;
        }

        int cheeseChoice = extraCheeseChoice.getSelectedIndex();
        if(cheeseChoice == 1){
            currentTotal += 3;
        }

        totalLabel.setText(currentTotal + "");
    }
}
