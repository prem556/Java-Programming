import java.util.Scanner;
public class SquareRootCalculate {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        Double number = Scanner.nextDouble();

        double squareRoot = Math.sqrt(number);

        System.out.println("SquareRoot"+squareRoot);
    }
}
