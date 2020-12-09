package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
 import static sun.security.x509.CertificateAlgorithmId.ALGORITHM;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[1]);
        FileOutputStream output = new FileOutputStream(args[2]);

        while (input.available() > 0) {
            int n = input.read();
            if (args[0].equals("-e")) output.write(n + 1000);
            else if (args[0].equals("-d")) output.write(n - 1000);
            else System.out.println("Wrong parameter (-e/-d)");

            //output.write(args[0].equals("-e")? n + 1000 : n - 1000);
        }

        input.close();
        output.close();

    }
}
