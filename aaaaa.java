import java.util.Random;
import java.util.Scanner;

public class aaaaa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String output = toTitleCase(input) + getRandomSpecialChar();
        System.out.println("Output: " + output);
    }

    public static String toTitleCase(String input) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                sb.append(c);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }

    public static char getRandomSpecialChar() {
        String specialChars = "!@#$%^&*()_+=-`~[]{};':\",./<>?";
        Random random = new Random();
        int index = random.nextInt(specialChars.length());
        return specialChars.charAt(index);
    }
}