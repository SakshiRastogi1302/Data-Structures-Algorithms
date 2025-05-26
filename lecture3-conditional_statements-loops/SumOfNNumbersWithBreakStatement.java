import java.util.Scanner;

public class SumOfNNumbersWithBreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            if (i == 5) {
                break;
            }
        }
        System.out.println("Sum of numbers from 1 to " + n + " is :- " + sum);

        sc.close();
    }    
}
