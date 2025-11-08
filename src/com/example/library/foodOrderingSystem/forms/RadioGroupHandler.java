package com.example.library.foodOrderingSystem.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioGroupHandler implements ActionListener {
    private final JRadioButton rbNone;
    private final JRadioButton rb5;
    private final JRadioButton rb10;
    private final JRadioButton rb15;

    private double selectedDiscount = 1.0;

    public RadioGroupHandler(JRadioButton rbNone, JRadioButton rb5, JRadioButton rb10, JRadioButton rb15) {
        this.rbNone = rbNone;
        this.rb5 = rb5;
        this.rb10 = rb10;
        this.rb15 = rb15;

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rbNone);
        buttonGroup.add(rb5);
        buttonGroup.add(rb10);
        buttonGroup.add(rb15);

        rbNone.setSelected(true);

        rbNone.addActionListener(this);
        rb5.addActionListener(this);
        rb10.addActionListener(this);
        rb15.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JRadioButton rb = (JRadioButton)e.getSource();

        if (rb.equals(rbNone)) {
             selectedDiscount = 1.0;
        } else if (rb.equals(rb5)) {
            selectedDiscount = 0.95;
        } else if (rb.equals(rb10)) {
            selectedDiscount = 0.90;
        } else if (rb.equals(rb15)) {
            selectedDiscount = 0.85;
        }
    }

    public double getSelectedDiscount() {return selectedDiscount;}
}