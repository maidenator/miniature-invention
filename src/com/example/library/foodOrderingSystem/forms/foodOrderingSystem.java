package com.example.library.foodOrderingSystem.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foodOrderingSystem extends JFrame {
    private JPanel mainPanel;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;

    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private final RadioGroupHandler discountHandler = new RadioGroupHandler(rbNone, rb5, rb10, rb15);

    private JLabel Php100;
    private JLabel Php80;
    private JLabel Php65;
    private JLabel Php55;
    private JLabel Php50;
    private JLabel Php40;
    private JLabel FoodsLabel;
    private JLabel DiscountsLabel;

    public foodOrderingSystem() {
        setTitle("Food Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        cPizza.setName("cPizza");
        cBurger.setName("cBurger");
        cFries.setName("cFries");
        cSoftDrinks.setName("cSoftDrinks");
        cTea.setName("cTea");
        cSundae.setName("cSundae");
        rbNone.setName("rbNone");
        rb5.setName("rb5");
        rb10.setName("rb10");
        rb15.setName("rb15");

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean pizzaSelected = cPizza.isSelected();
                boolean burgerSelected = cBurger.isSelected();
                boolean friesSelected = cFries.isSelected();
                boolean softDrinksSelected = cSoftDrinks.isSelected();
                boolean teaSelected = cTea.isSelected();
                boolean sundaeSelected = cSundae.isSelected();

                double totalPrice = 0;
                if(pizzaSelected) {
                    totalPrice += 100;
                }
                if(burgerSelected) {
                    totalPrice += 80;
                }
                if(friesSelected) {
                    totalPrice += 65;
                }
                if(softDrinksSelected) {
                    totalPrice += 55;
                }
                if(teaSelected) {
                    totalPrice += 50;
                }
                if(sundaeSelected) {
                    totalPrice += 40;
                }

                String message = "The total price is Php " + String.format("%.2f", totalPrice * discountHandler.getSelectedDiscount());

                JOptionPane.showMessageDialog(null, message);
            }
        });
    }
}