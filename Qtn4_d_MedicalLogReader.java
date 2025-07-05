import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MedicalLogReader {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the path to the medical log file: ");
        String filename = inputScanner.nextLine();

        File medicalLogFile = new File(filename);

        try (Scanner fileScanner = new Scanner(medicalLogFile)) {
            System.out.println("---- Medical Log Content ----");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found. Please check the file path.");
        }

        inputScanner.close();
    }
}

