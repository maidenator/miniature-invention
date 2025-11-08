package com.example.library.characterRemover;

import com.example.library.characterRemover.forms.CharacterRemover;

import javax.swing.*;

public class MainCharacterRemover {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            CharacterRemover remover =  new CharacterRemover();
        });
    }
}
