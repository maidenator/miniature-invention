package com.example.library.foodOrderingSystem;

import com.example.library.foodOrderingSystem.forms.foodOrderingSystem;

import javax.swing.*;

public class MainFoodOrderingSystem {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            foodOrderingSystem order = new foodOrderingSystem();
        });
    }
}