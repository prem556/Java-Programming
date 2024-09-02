import java.util.Scanner;
public class CheckGreaterThan100 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Prompt user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is greater than 100
        boolean isGreater = number > 100;

        // Output the result
        System.out.println("Is the number greater than 100? " + isGreater);
    }
}
