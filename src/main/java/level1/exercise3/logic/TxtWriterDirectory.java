package level1.exercise3.logic;

import java.io.FileWriter;
import java.io.IOException;

public class TxtWriterDirectory {

    public static void writeTerminalToTXT(String output) {


        try (FileWriter writer = new FileWriter("src/main/java/level1/exercise3/txt/terminalWriter.txt", true)) {

            writer.write(output);
            writer.write(System.lineSeparator());

        } catch (IOException e) {
            System.out.println("Error writing to txt file: " + e.getMessage());
        }
    }
}
