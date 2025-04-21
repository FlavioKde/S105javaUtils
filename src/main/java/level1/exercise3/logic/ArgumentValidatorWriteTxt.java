package level1.exercise3.logic;

public class ArgumentValidatorWriteTxt {
    public static boolean isValid(String[] args) {
        return args.length > 0 && args[0] != null && !args[0].trim().isEmpty();
    }
    }

