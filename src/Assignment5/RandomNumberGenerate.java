import java.util.Scanner;
public class RandomNumberGenerate {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 100) + 1;

        // Output the random number
        System.out.println("Random Number: " + randomNumber);
    }
}
