package com.sinthoras39.hasher.MainWindow.Toolbar;

import com.sinthoras39.hasher.Funcs.LabelBuilder;
import com.sinthoras39.hasher.MainWindow.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.security.Security;

public class Toolbar {
    public static JComboBox hashAlgo;
    public static void initToolbar() {
        Container bar = new Container();
        bar.setLayout(new GridLayout(1, 2));
        bar.setPreferredSize(new Dimension(0, 50));

        {
            Container bar2 = new Container();
            bar2.setLayout(new FlowLayout());
            bar.add(bar2);

            bar2.add(new LabelBuilder("Füge ein Text in das Textfeld ein und drücke dann auf 'Hash'"));
        }

        {

            Container bar2 = new Container();
            bar2.setLayout(new FlowLayout());
            bar.add(bar2);
            {
                bar2.add(new LabelBuilder("Hash Algorithmus: "));
            }
            {
                String[] algos = Security.getAlgorithms("MessageDigest").toArray(new String[]{});
                hashAlgo = new JComboBox(algos);
                bar2.add(hashAlgo);
            }
        }


        MainFrame.mainPane.add(bar, BorderLayout.NORTH);
    }
}
