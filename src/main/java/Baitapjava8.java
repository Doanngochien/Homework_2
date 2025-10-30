import java.util.*;
import java.util.stream.*;
import java.io.*;


interface Logger {
    void log(String message);

    default void logError(String message) {
        log("[ERROR] " + message);
    }

    default void logInfo(String message) {
        log("[INFO] " + message);
    }


    default void logWarning(String message) {
        log("[WARNING] " + message);
    }
}


class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}


class FileLogger implements Logger {
    private String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(message);
        } catch (IOException e) {
            System.out.println("[ERROR] Không thể ghi file: " + e.getMessage());
        }
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class MathUtils {
    public static int square(int n) {
        return n * n;
    }
}


