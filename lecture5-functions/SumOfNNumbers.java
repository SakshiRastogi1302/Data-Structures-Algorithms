
import java.util.Scanner;


public class SumOfNNumbers {
    static int sumOfNNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int n = sc.nextInt();

        System.out.println("Sum of numbers from 1"+" to "+n+" is :- "+sumOfNNumbers(n));

        sc.close();
    }
}
