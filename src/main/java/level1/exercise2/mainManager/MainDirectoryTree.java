package level1.exercise2.mainManager;


import level1.exercise2.logic.ArgumentValidatorTree;
import level1.exercise2.logic.ManagementDirectoryTree;

import java.io.File;

public class MainDirectoryTree {

    public static void main(String[] args) {

        if (!ArgumentValidatorTree.isValid(args)) {
            System.out.println("Please provide a directory path.");
            return;
        }
        String path = args[0];
        File rootDirectory = new File(path);

        ManagementDirectoryTree manager= new ManagementDirectoryTree(path);
        manager.loadDirectory(rootDirectory, 0);




    }
    }
