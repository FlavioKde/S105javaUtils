package level3.exercise1.dataClass;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.security.Key;
import java.security.SecureRandom;

public class EncryptDecrypt {
    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";

    public static void encryptFile(File inputFile, File outputFile, File keyFile, File ivFile) throws Exception {

        SecretKey key = generateKey(128);
        IvParameterSpec iv = generateIV();

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
             CipherOutputStream cipherOutputStream = new CipherOutputStream(fileOutputStream, cipher)) {

            byte [] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                cipherOutputStream.write(buffer, 0, bytesRead);
            }

        }

        saveKey(key, keyFile);
        saveIv(iv, ivFile);

    }

    public static void decryptFile(File inputFile, File outputFile,
                                   File keyFile, File ivFile) throws Exception {

        SecretKey key = loadKey(keyFile);
        IvParameterSpec iv = loadIV(ivFile);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {


            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = cipherInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);

            }

        }

    }
    public static SecretKey generateKey(int keySize) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(keySize);
        return keyGen.generateKey();
    }
    public static IvParameterSpec generateIV() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }
    public static void saveKey(SecretKey key, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(key.getEncoded());
        }
    }
    public static SecretKey loadKey(File file) throws IOException {
        byte[] keyBytes = Files.readAllBytes(file.toPath());
        return new SecretKeySpec(keyBytes, "AES");
    }


    public static IvParameterSpec loadIV(File file) throws IOException {
        byte[] ivBytes = Files.readAllBytes(file.toPath());
        return new IvParameterSpec(ivBytes);
    }
    public static void saveIv(IvParameterSpec iv, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(iv.getIV());
        }
    }

}