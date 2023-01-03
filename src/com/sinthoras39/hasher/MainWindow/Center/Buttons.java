package com.sinthoras39.hasher.MainWindow.Center;

import com.sinthoras39.hasher.Funcs.ButtonBuilder;

import java.awt.*;

public class Buttons extends Container {

    public Buttons() {
        setLayout(new FlowLayout());

        add(getHasher());
        add(getFileHasher());
    }

    private static ButtonBuilder getHasher() {
        ButtonBuilder button = new ButtonBuilder("Text links hashen");
        button.addActionListener(new Hasher());
        button.setPreferredSize(new Dimension(200,40));
        return button;
    }

    private static ButtonBuilder getFileHasher() {
        ButtonBuilder button = new ButtonBuilder("Datei zum hashen wählen");
        button.addActionListener(new FileHasherActionListener());
        button.setPreferredSize(new Dimension(200,40));
        return button;
    }
}
