package level1.exercise3.mainManager;



import level1.exercise3.logic.ArgumentValidatorWriteTxt;
import level1.exercise3.logic.ManagementDirectoryWriteTxt;


import java.io.File;

public class MainDirectoryWriteTxt {

    public static void main(String[] args) {

        if (!ArgumentValidatorWriteTxt.isValid(args)) {
            System.out.println("Please provide a directory path.");
            return;
        }
        String path = args[0];
        File rootDirectory = new File(path);

        ManagementDirectoryWriteTxt manager = new ManagementDirectoryWriteTxt(path);
        manager.loadDirectory(rootDirectory,0);


    }
    }
