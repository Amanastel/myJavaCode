package Day007;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Problem02 {
    private final File file;
    private final String contentToWrite;
    private final String contentToAppend;

    public Problem02(String filename, String contentToWrite, String contentToAppend) {
        this.file = new File(filename);
        this.contentToWrite = contentToWrite;
        this.contentToAppend = contentToAppend;
    }

    public void writeToFile() {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(contentToWrite);
            writer.close();
            System.out.println("Successfully wrote to file " + file.getName());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void appendToFile() {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(contentToAppend);
            writer.close();
            System.out.println("Successfully appended to file " + file.getName());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Integer> getAnalysis() throws IOException {
        List<Integer> result = new ArrayList<>();
        String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));

        int digitCount = 0;
        int letterCount = 0;
        int specialSymbolCount = 0;

        for (char c : content.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isLetter(c)) {
                letterCount++;
            } else {
                specialSymbolCount++;
            }
        }

        result.add(digitCount);
        result.add(letterCount);
        result.add(specialSymbolCount);

        return result;
    }
}
