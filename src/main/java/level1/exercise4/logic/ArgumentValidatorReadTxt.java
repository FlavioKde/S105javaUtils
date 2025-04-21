package level1.exercise4.logic;

public class ArgumentValidatorReadTxt {
    public static boolean isValid(String[] args) {
        return args.length > 0 && args[0] != null && !args[0].trim().isEmpty();
    }
    }

