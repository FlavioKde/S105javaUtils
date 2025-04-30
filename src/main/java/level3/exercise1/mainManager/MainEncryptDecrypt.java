package level3.exercise1.mainManager;

import level3.exercise1.dataClass.Encrypt;
import level3.exercise1.dataClass.Decrypt;

import java.io.File;

public class MainEncryptDecrypt {
    public static void main(String[] args) {
        try {

            File inputFile = new File("src/main/java/level2/exercise1/txt/readme.txt");
            File encryptedFile = new File("file_encrypted.aes");
            File decryptedFile = new File("file_decrypted.txt"); //


            File keyFile = new File("key.bin");
            File ivFile = new File("iv.bin");


            Encrypt.encryptFile(inputFile, encryptedFile, keyFile, ivFile);
            System.out.println("File successfully encrypted.");


            Decrypt.decryptFile(encryptedFile, decryptedFile, keyFile, ivFile);
            System.out.println("File successfully decrypted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
