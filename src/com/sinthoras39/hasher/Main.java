package com.sinthoras39.hasher;

import com.sinthoras39.hasher.MainWindow.MainFrame;

import java.awt.*;

public class Main {
    public static MainFrame mainFrame;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });

    }
}
