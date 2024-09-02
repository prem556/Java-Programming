import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = Scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.print("reversed string:"+reversed);
    }
}
