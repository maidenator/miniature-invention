package com.example.library.passwordValidator;

import com.example.library.passwordValidator.forms.PasswordValidator;

import javax.swing.*;

public class MainPasswordValidator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
             PasswordValidator passwordValidator= new PasswordValidator();
        });
    }
}