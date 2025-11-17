import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:"); // Prompt first
        int n = sc.nextInt(); // Then read input

        if (n % 2 == 0) {
            System.out.println("You entered an even number");
        } else {
            System.out.println("You entered an odd number");
        }

        sc.close(); // Always good practice to close Scanner
    }
}