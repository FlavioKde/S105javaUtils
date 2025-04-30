package level1.exercise1.mainManager;


import level1.exercise1.logic.ArgumentValidator;
import level1.exercise1.logic.ManagementDirectory;


public class MainDirectory {

    public static void main(String[] args) {

        if (!ArgumentValidator.isValid(args)) {
            System.out.println("Please provide a directory path.");
            return;
        }

        new ManagementDirectory(args[0]);
    }
    }
