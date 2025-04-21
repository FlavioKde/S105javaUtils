package level1.exercise2.logic;

public class ArgumentValidatorTree {
    public static boolean isValid(String[] args) {
        return args.length > 0 && args[0] != null && !args[0].trim().isEmpty();
    }
    }

