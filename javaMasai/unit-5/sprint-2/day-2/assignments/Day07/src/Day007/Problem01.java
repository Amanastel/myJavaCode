package Day007;

import java.io.*;

public class Problem01 {
    public static void main(String[] args) {
        String[] numbers = {"9876543210", "8765432109", "7654321098", "6543210987", "5432109876",
                "4321098765", "3210987654", "2109876543", "1098765432", "0987654321"};

        try {
            FileWriter writer = new FileWriter("abc.txt");
            for (String number : numbers) {
                writer.write(number + "\n");
            }
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
            FileWriter filteredWriter = new FileWriter("filtered_numbers.txt");
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches("[9|8|7|6]\\d{9}")) {
                    filteredWriter.write(line + "\n");
                }
            }
            reader.close();
            filteredWriter.close();

            System.out.println("Contents of abc.txt:");
            printFileContents("abc.txt");
            System.out.println("\nContents of filtered_numbers.txt:");
            printFileContents("filtered_numbers.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printFileContents(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
