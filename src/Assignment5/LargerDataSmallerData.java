import java.util.Scanner;
public class LargerDataSmallerData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a large integer (long): ");
        long largeNumber = scanner.nextLong();

        byte smallerNumber = (byte) largeNumber;

        System.out.println("The number converted to byte is: " + smallerNumber);
    }
}
