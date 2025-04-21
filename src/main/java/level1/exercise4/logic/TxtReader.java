package level1.exercise4.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TxtReader {

    public static void readTxt(String filePath) {

        System.out.println("Reading file: " + filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

    }
}