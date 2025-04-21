package level1.exercise4.mainManager;



import level1.exercise4.logic.ArgumentValidatorReadTxt;
import level1.exercise4.logic.ManagementDirectoryReadTxt;


import java.io.File;

public class MainDirectoryReadTxt {

    public static void main(String[] args) {

        if (!ArgumentValidatorReadTxt.isValid(args)) {
            System.out.println("Please provide a directory path.");
            return;
        }
        String path = args[0];
        //File rootDirectory = new File(path);

        ManagementDirectoryReadTxt manager = new ManagementDirectoryReadTxt(path);
        manager.loadDirectory();

    }
    }
