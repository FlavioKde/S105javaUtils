package level2.exercise1.mainManager;


import level2.exercise1.logic.ManagementDirectoryWriteTxt;
import level2.exercise1.logic.ConfigLoader;


import java.io.File;

public class MainDirectoryWriteTxt {

    public static void main(String[] args) {


            String directoryToRead = ConfigLoader.getProperty("directory.to.read");
            String outputFileName = ConfigLoader.getProperty("output.file.name");
            String outputFileDirectory = ConfigLoader.getProperty("output.file.directory");


            if(directoryToRead == null || outputFileName == null || outputFileDirectory == null){
                System.out.println("Error: Configurations are not correctly loaded from config.properties");
                return;
            }


        File rootDirectory = new File(directoryToRead);


        ManagementDirectoryWriteTxt manager = new ManagementDirectoryWriteTxt( directoryToRead, outputFileDirectory, outputFileName);
        manager.loadDirectory(rootDirectory,0);


    }
    }
