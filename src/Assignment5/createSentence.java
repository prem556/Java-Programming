import java.util.Scanner;
public class createSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        System.out.print("Enter third string: ");
        String string3 = scanner.nextLine();


        String sentence = string1 + " " + string2 + " " + string3 + ".";


        System.out.println("Complete Sentence: " + sentence);
    }
}
