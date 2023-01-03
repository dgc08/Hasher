package com.sinthoras39.hasher.MainWindow;

import com.sinthoras39.hasher.MainWindow.Bottom.Bottom;
import com.sinthoras39.hasher.MainWindow.Center.Center;
import com.sinthoras39.hasher.MainWindow.Menu.MenuBar;
import com.sinthoras39.hasher.MainWindow.Toolbar.Toolbar;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static Container mainPane;

    public MainFrame() {
        // Window
        setTitle("Hasher");

        setSize(2000, 400);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Container
        mainPane = getContentPane();

        mainPane.setBackground(Color.DARK_GRAY);
        mainPane.setLayout(new BorderLayout());

        //Init parts
        Bottom.initBottomBar();         // Bottom Bar
        setJMenuBar(MenuBar.INSTANCE);  // Menu Bar
        Toolbar.initToolbar();          // Toolbar
        Center.initCenter();            // Center
    }

}
