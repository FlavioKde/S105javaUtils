package level2.exercise1.logic;

import java.io.FileWriter;
import java.io.IOException;

public class TxtWriterDirectory {
    private String fullPath;

    public TxtWriterDirectory(String outputDirectory, String outputFileName) {

        this.fullPath = outputDirectory + "/" + outputFileName;
    }

    public void writeTerminalToTXT(String output) {


        try (FileWriter writer = new FileWriter(fullPath, true)) {

            writer.write(output);
            writer.write(System.lineSeparator());

        } catch (IOException e) {
            System.out.println("Error writing to txt file: " + e.getMessage());
        }
    }
}
