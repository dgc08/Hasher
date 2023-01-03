package com.sinthoras39.hasher.Funcs;

import com.sinthoras39.hasher.MainWindow.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Author implements ActionListener {
    public static final String website = "https://github.com/dgc08";

    public static void openWebsite() {

        Desktop desktop = Desktop.getDesktop();
        URL url = null;
        try {
            url = new URL(website);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        try {
            desktop.browse(url.toURI());
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int res = JOptionPane.showConfirmDialog(MainFrame.mainPane,
                "Dieses Programm wurde von Sinthoras39 geschrieben. \nZum GitHub: " + website + "\nMöchtest du disen Link öffnen?",
                "Über mich",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (res == 0) {
            openWebsite();
        }
    }
}
