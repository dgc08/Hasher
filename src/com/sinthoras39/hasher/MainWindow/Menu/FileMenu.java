package com.sinthoras39.hasher.MainWindow.Menu;


import com.sinthoras39.hasher.Funcs.Author;
import com.sinthoras39.hasher.MainWindow.Center.FileHasherActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FileMenu{
    private static JMenu file;

    private static JMenuItem endItem = new JMenuItem("Beenden") {
        {
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }
    };
    private static JMenuItem aboutItem = new JMenuItem("Über mich") {
        {
            addActionListener(new Author());
        }
    };
    private static JMenuItem openFileItem = new JMenuItem("Datei öffnen") {
        {
            addActionListener(new FileHasherActionListener());
        }
    };

    public static void register() {
        file = new JMenu("Datei");

        initItems();

        MenuBar.INSTANCE.add(file);
    }
    private static void initItems() {
        file.add(endItem);
        file.add(openFileItem);

        file.addSeparator();

        file.add(aboutItem);

    }

}
