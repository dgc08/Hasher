package com.sinthoras39.hasher.Funcs;

import javax.swing.*;
import java.awt.*;

public class ButtonBuilder extends JButton {
    public static final Color DARKER_GRAY = new Color(43, 42, 40);

    public ButtonBuilder(String text, boolean darkMode) {
        super(text);
        if (!darkMode) {
            setForeground(DARKER_GRAY);
        }
        else {
            setBackground(DARKER_GRAY);
            setForeground(Color.WHITE);
        }
    }
    public ButtonBuilder(String text) {
        super(text);
        setBackground(DARKER_GRAY);
        setForeground(Color.WHITE);
    }

    public ButtonBuilder setForegroundBuilder(Color fg) {
        super.setForeground(fg);
        return this;
    }
}
