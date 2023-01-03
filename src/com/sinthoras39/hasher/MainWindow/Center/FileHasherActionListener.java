package com.sinthoras39.hasher.MainWindow.Center;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class FileHasherActionListener implements ActionListener {
    /**
     * @author ChatGPT, Modified by Sinthoras39
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            String hash = "";

            // Do something with the selected file
            try {
                hash = FileHasher.hashFile(selectedFile);
            } catch (NoSuchAlgorithmException | IOException ex) {
                ex.printStackTrace();
            }
            LeftSite.setHash(hash);
            LeftSite.setType("Datei " + selectedFile.getName());
        }
    }
}
