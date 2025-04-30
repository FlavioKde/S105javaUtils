package level3.exercise1.dataClass;


import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;




public class Decrypt {

    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";

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


    public static SecretKey loadKey(File file) throws IOException {
        byte[] keyBytes = Files.readAllBytes(file.toPath());
        return new SecretKeySpec(keyBytes, "AES");
    }


    public static IvParameterSpec loadIV(File file) throws IOException {
        byte[] ivBytes = Files.readAllBytes(file.toPath());
        return new IvParameterSpec(ivBytes);
    }
}
