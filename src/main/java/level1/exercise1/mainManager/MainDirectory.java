package level1.exercise1.mainManager;

import level1.exercise1.dataClass.ListDirectory;
import level1.exercise1.logic.ArgumentValidator;
import level1.exercise1.logic.ManagementDirectory;

import java.io.File;

public class MainDirectory {

    public static void main(String[] args) {
    /*
        ArgumentValidator argumentValidator = new ArgumentValidator();
        argumentValidator.validateArguments(args);

    }

     */
        if (!ArgumentValidator.isValid(args)) {
            System.out.println("Please provide a directory path.");
            return;
        }

        new ManagementDirectory(args[0]);
    }
    }
