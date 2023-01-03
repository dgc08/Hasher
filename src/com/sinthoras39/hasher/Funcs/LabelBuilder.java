package com.sinthoras39.hasher.Funcs;

import javax.swing.*;
import java.awt.*;

public class LabelBuilder extends JLabel {
    public LabelBuilder(String text, boolean darkMode) {
        super(text);
        if (!darkMode) {
            setForeground(Color.BLACK);
        }
        else {
            setForeground(Color.WHITE);
        }
    }
    public LabelBuilder(String text) {
        super(text);
        setForeground(Color.WHITE);
    }

    public LabelBuilder setForegroundBuilder(Color fg) {
        super.setForeground(fg);
        return this;
    }
}
