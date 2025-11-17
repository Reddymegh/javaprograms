import java.util.Scanner;

public class addsubdivmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter operation (+, -, *, /, %):");
        char op = sc.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                result = (double) a / b;
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    sc.close();
                    return;
                }
                result = a % b;
                break;
            default:
                System.out.println("Invalid operation");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
