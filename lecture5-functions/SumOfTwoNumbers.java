import java.util.Scanner;

public class SumOfTwoNumbers {
    static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int a = sc.nextInt();
        System.out.print("Enter the second number :- ");
        int b = sc.nextInt();

        System.out.println("Sum of 2 numbers "+a+" & "+b+" is :- "+sum(a,b));

        sc.close();
    }
}
