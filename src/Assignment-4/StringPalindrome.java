import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a string palindrome:");
        String input = Scanner.nextLine().toLowerCase().replaceAll("//s","");

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)){
            System.out.print("The string is a palindrome.");
        }else{
            System.out.print("The string is not a palindrome.");
        }
    }
}
