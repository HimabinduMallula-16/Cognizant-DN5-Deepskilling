public class Logger {

    // private static instance
    private static Logger instance;

    // private constructor
    private Logger() {
        System.out.println("Logger object created");
    }

    // public static method to get instance
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }
}