package level1.exercise3.logic;

import level1.exercise3.dataClass.ListDirectoryWriteTxt;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class ManagementDirectoryWriteTxt {
      private ListDirectoryWriteTxt listDirectoryWriteTxt;

    public ManagementDirectoryWriteTxt(String outputPath) {

        this.listDirectoryWriteTxt = new ListDirectoryWriteTxt(outputPath );

    }

    public void loadDirectory(File directory, int level) {
        if (!directory.exists()) {

            TxtWriterDirectory.writeTerminalToTXT("The directory does not exist");
            return;
        }
        if (!directory.isDirectory()) {

            TxtWriterDirectory.writeTerminalToTXT("The specified path is not a directory");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {

            TxtWriterDirectory.writeTerminalToTXT("The directory is empty");
            return;
        }
        Arrays.sort(files);
        for (File file : files) {

                String indent= "  ".repeat(level);

                String type = file.isDirectory() ? "[D]" : "[F]";
                String lastModified = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(file.lastModified());


                String output = String.format("%s%s %s - Last Modified: %s", indent, type, file.getName(), lastModified);


                TxtWriterDirectory.writeTerminalToTXT(output);

                if (file.isDirectory()) {
                    loadDirectory(file, level + 1);
                }
            }
        }

    }

