import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        System.out.println("=== BÀI 1: Logger ===");
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.logError("Lỗi hệ thống!");
        consoleLogger.logInfo("Chương trình chạy bình thường.");
        consoleLogger.logWarning("Bộ nhớ sắp đầy.");

        Logger fileLogger = new FileLogger("log.txt");
        fileLogger.logInfo("Ghi log vào file thành công!");
        fileLogger.logError("Có lỗi khi ghi file!");

        // -------------------- Bài 2 --------------------
        System.out.println("\n=== BÀI 2: Functional Interface & Lambda ===");
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> (b != 0) ? a / b : 0;

        System.out.println("5 + 3 = " + add.operate(5, 3));
        System.out.println("5 - 3 = " + sub.operate(5, 3));
        System.out.println("5 * 3 = " + mul.operate(5, 3));
        System.out.println("5 / 3 = " + div.operate(5, 3));


        System.out.println("\n=== BÀI 3: Stream API với List ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Các số chẵn: " + evenNumbers);

        List<Integer> squaredOver3 = numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Bình phương các số > 3: " + squaredOver3);


        System.out.println("\n=== BÀI 4: Static Method & Stream ===");
        List<Integer> squaredList = numbers.stream()
                .map(MathUtils::square)
                .collect(Collectors.toList());
        System.out.println("Bình phương tất cả các số: " + squaredList);


        System.out.println("\n=== BÀI 5: Optional ===");
        Optional<String> name = Optional.ofNullable("Doan Ngoc Hien");
        System.out.println("Tên: " + name.orElse("Không có tên"));

        Optional<String> nullName = Optional.ofNullable(null);
        System.out.println("Tên khác: " + nullName.orElse("N/A"));
    }
}