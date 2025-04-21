package level2.exercise1.logic;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ManagementDirectoryWriteTxt {

     private String directoryToRead;
     private TxtWriterDirectory txtWriterDirectory;

       public ManagementDirectoryWriteTxt(String directoryToRead, String outputFileDirectory, String outputFileName) {
           this.directoryToRead = directoryToRead;
           this.txtWriterDirectory = new TxtWriterDirectory(outputFileDirectory, outputFileName);

    }

    public void loadDirectory(File directory, int level) {
        if (!directory.exists()) {

            txtWriterDirectory.writeTerminalToTXT("The directory does not exist");
            return;
        }
        if (!directory.isDirectory()) {

            txtWriterDirectory.writeTerminalToTXT("The specified path is not a directory");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {

            txtWriterDirectory.writeTerminalToTXT("The directory is empty");
            return;
        }
        Arrays.sort(files);
        for (File file : files) {

                String indent= "  ".repeat(level);

                String type = file.isDirectory() ? "[D]" : "[F]";
                String lastModified = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(file.lastModified());


                String output = String.format("%s%s %s - Last Modified: %s", indent, type, file.getName(), lastModified);
                txtWriterDirectory.writeTerminalToTXT(output);



                if (file.isDirectory()) {
                    loadDirectory(file, level + 1);
                }
            }
        }

    }

