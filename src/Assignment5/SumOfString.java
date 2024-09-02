import java.util.Scanner;
public class SumOfString {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the first string number:");
        String num1 = Scanner.nextLine();
        System.out.println("Enter the second string number:");
        String num2 = Scanner.nextLine();

        int sum = Integer.parseInt(num1)+Integer.parseInt(num2);
        System.out.println("sum:"+sum);
    }
}
