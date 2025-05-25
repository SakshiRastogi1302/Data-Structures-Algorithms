import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :-");
        int a = sc.nextInt();
        System.out.print("Enter the second number :-");
        int b = sc.nextInt();
        System.out.print("Enter the operation you want to perform :-");
        char operator = sc.next().charAt(0);
        int result = 0;

        // Using Rule Switch
        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '%' -> result = a % b;
            default -> System.out.println("Enter valid operator (+,-,*,/,%)");

        }
        
        System.out.println(result);

    }
}
