package level1.exercise1.logic;
/*
public class ArgumentValidator {

    public void validateArguments(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the path as an argument.");
        } else {
            System.out.println("Path provided: " + args[0]);
        }
        String relativePath = args[0];
        new ManagementDirectory(relativePath);
    }

 */
public class ArgumentValidator {
    public static boolean isValid(String[] args) {
        return args.length > 0 && args[0] != null && !args[0].trim().isEmpty();
    }
    }

