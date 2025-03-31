import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two numbers from the user
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        try {
            // Divide the numbers
            int result = num1 / num2;
            System.out.println("Answer: " + result);
        } catch (ArithmeticException e) {
            // Handle divide-by-zero exception
            System.out.println("A number Cannot be divided by zero!!!");
        }

        scanner.close();
    }
}


