import java.util.Scanner;

public class SumOfNNumbersDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of numbers divisible by 3 from 1 to " + n + " are    :- " + sum);
        sc.close();
            
    }
  
}
