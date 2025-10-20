import java.util.Scanner;

public class JavaConsoleCalculator
{
        public static int add(int num1, int num2) {
        return num1+ num2;
    }

    public static int subtract(int num1, int num2) {
        return num1- num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result= true;

        System.out.println(" Java Console Calculator ");

        while (result) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exit.");
                result = false;
                break;
            }

            System.out.print("Enter number 1: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter number 2: ");
            int num2 = scanner.nextInt();

            int answer = 0;

            switch (choice) {
                case 1:
                    answer = add(num1, num2);
                    System.out.println("Result: " + answer);
                    break;
                case 2:
                    answer = subtract(num1, num2);
                    System.out.println("Result: " + answer);
                    break;
                case 3:
                    answer = multiply(num1, num2);
                    System.out.println("Result: " + answer);
                    break;
                case 4:
                    answer = divide(num1, num2);
                    System.out.println("Result: " + answer);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
