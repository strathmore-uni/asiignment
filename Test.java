import java.util.Scanner;

    public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Accept two numbers from the user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            try {
                // Divide the numbers
                int result = num1 / num2;
                System.out.println("The result is: " + result);
            } catch (ArithmeticException e) {
                // Handle divide-by-zero exception
                System.out.println("Cannot divide by zero!");
            }

            scanner.close();
        }
    }

}
