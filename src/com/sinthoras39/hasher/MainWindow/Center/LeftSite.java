package com.sinthoras39.hasher.MainWindow.Center;

import javax.swing.*;
import java.awt.*;

class LeftSite extends Container{
    private static JTextPane result = new JTextPane();
    private static JTextPane type = new JTextPane();

    public LeftSite() {
        setLayout(new GridLayout(3,1));

        add(new Buttons());

        Container bar2 = new Container();
        bar2.setLayout(new FlowLayout() {
            {
                setHgap(30);
                setVgap(25);
            }
        });
        add(bar2);

        bar2.add(result);

        result.setEditable(false);
        result.setBackground(Color.DARK_GRAY);
        result.setForeground(Color.WHITE);
        result.setBorder(null);

        bar2.add(type);

        type.setEditable(false);
        type.setBackground(Color.DARK_GRAY);
        type.setForeground(Color.WHITE);
        type.setBorder(null);
    }

    protected static void setHash(String text) {
        result.setText(text);
    }
    public static void setType(String type) {
        LeftSite.type.setText("Quelle des Hashes: " + type);
    }
}
