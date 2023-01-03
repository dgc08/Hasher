package com.sinthoras39.hasher.MainWindow.Bottom;

import com.sinthoras39.hasher.Funcs.ButtonBuilder;
import com.sinthoras39.hasher.MainWindow.MainFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bottom {


    public static void initBottomBar() {
        Container bar = new Container();
        bar.setLayout(new FlowLayout());
        bar.setPreferredSize(new Dimension(400, 50));

        bar.add(getExit());

        MainFrame.mainPane.add(bar, BorderLayout.SOUTH);
    }

    private static ButtonBuilder getExit() {
        ButtonBuilder button = new ButtonBuilder("Beenden");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        return button;
    }
}
