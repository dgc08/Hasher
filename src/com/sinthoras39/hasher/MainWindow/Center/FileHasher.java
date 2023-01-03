package com.sinthoras39.hasher.MainWindow.Center;


import com.sinthoras39.hasher.MainWindow.Toolbar.Toolbar;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author ChatGPT, Modified by Sinthoras39
 */
public class FileHasher {
    public static String hashFile(File file) throws NoSuchAlgorithmException, IOException {
        // Read the file as bytes
        byte[] fileBytes = Files.readAllBytes(file.toPath());

        // Hash the bytes with SHA-256
        String algo = (String) Toolbar.hashAlgo.getSelectedItem();
        MessageDigest digest = MessageDigest.getInstance(algo);
        byte[] hash = digest.digest(fileBytes);

        // Print the hash as a hexadecimal string
        return Hasher.bytesToHex(hash);
    }


}
