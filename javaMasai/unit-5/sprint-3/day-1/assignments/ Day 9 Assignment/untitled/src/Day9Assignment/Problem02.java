package Day9Assignment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
public class Problem02 {
    public static void main(String[] args) {
        try {
            Path filePath = Path.of("car.txt");
            String data = "Ertiga 7 1200000 Toyota\n" +
                    "Eon 5 475000 Hyundai\n" +
                    "Creta 5 1450000 Hyundai\n" +
                    "Alto 5 499000 Maruti\n" +
                    "Fortuner 7 3450000 Toyota\n";
            Files.writeString(filePath, data);
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
