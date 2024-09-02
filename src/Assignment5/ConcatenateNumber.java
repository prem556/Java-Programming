import java.util.Scanner;
public class ConcatenateNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String num1 = Scanner.nextLine();
        System.out.println("Enter the Second number:");
        String num2 = Scanner.nextLine();

        String ConcatenateNumber = num1 + num2;

        System.out.println("ConcatenateNumber."+ConcatenateNumber);

    }
}
