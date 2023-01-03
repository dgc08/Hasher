package com.sinthoras39.hasher.MainWindow.Center;

import com.sinthoras39.hasher.MainWindow.Toolbar.Toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hasher implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String input = Text.getTextContent();

        // Convert the string to bytes
        byte[] inputBytes = input.getBytes();

        // Hash the bytes with SHA-256
        MessageDigest digest = null;
        try {
            String algo = (String) Toolbar.hashAlgo.getSelectedItem();
            digest = MessageDigest.getInstance(algo);
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        byte[] hash = digest.digest(inputBytes);

        LeftSite.setHash(bytesToHex(hash));
        LeftSite.setType("Text");
    }
    // Converts a byte array to a hexadecimal string
    public static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return "(0x)  " + result.toString();
    }
}
