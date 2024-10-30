import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        System.out.print("Output: ");
        printDigits(number);
    }

    public static void printDigits(int number) {
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i));
            if (i < numStr.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}