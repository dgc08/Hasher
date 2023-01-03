package com.sinthoras39.hasher.MainWindow.Center;

import com.sinthoras39.hasher.Funcs.ButtonBuilder;

import javax.swing.*;
import java.awt.*;

class Text extends Container{
    private static JTextArea ta = new JTextArea("", 50, 30);

    static {
        ta.setForeground(Color.WHITE);
        ta.setBackground(ButtonBuilder.DARKER_GRAY);
        ta.setCaretColor(Color.WHITE);
    }

    public Text() {
        setLayout(new GridLayout());
        add(getScrollPane());
    }

    private static JScrollPane getScrollPane() {
        JScrollPane scroll = new JScrollPane(ta);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        return scroll;
    }

    protected static String getTextContent () {
        return ta.getText();
    }


}
