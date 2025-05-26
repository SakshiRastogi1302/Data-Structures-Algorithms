import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int sum = 0;

        // Using For Loop
        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        // }

        // System.out.println("Sum of numbers from 1 to " + n + " is :- " + sum);
        // sc.close();

        // Using Wile Loop
        int i = 1;
        
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }

        System.out.println("Sum of numbers from 1 to " + n + " is :- " + sum);

        sc.close();

    }
}
