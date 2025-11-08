package com.example.library.numberCounter;

import com.example.library.numberCounter.forms.NumberCounter;

import javax.swing.*;


public class MainNumberCounter {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            NumberCounter counter = new NumberCounter();
        });

    }
}
