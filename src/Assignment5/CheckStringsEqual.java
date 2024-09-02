
    import java.util.Scanner;
    public class CheckStringsEqual {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user for two strings
            System.out.print("Enter the first string: ");
            String string1 = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String string2 = scanner.nextLine();

            // Check if the strings are equal
            boolean areEqual = string1.equals(string2);

            // Output the result
            System.out.println("Are the two strings equal? " + areEqual);
        }
    }

