import java.util.Scanner;

public class BookDescriptionAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the librarian
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();

        // Normalizing case and splitting words
        String[] words = description.toLowerCase().split("\\W+");

        int count = 0;
        for (String word : words) {
            if (word.equals("uganda")) {
                count++;
            }
        }

        // Displaying the results
        System.out.println("The word 'Uganda' appears " + count + " time(s) in the description.");
        
        scanner.close();
    }
}

