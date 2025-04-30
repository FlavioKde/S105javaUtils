package level3.exercise1.dataClass;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

public class Encrypt {

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

    public static void saveIv(IvParameterSpec iv, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(iv.getIV());
        }
    }

}
