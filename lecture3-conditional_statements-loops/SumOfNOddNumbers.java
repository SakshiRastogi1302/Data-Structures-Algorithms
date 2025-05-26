import java.util.Scanner;

public class SumOfNOddNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        int sum = 0;

        // Approach 1 Using For Loop
        // for (int i = 1; i <= n; i += 2) {
        //     sum = sum + i;
        // }

        //Approach 1 Using While Loop
        int i = 1;

        while(i<=n){
            if (i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        }


        //Approach 2
        // for (int i = 1; i <= n; i++) {
        //     if (i % 2 != 0) {
        //         sum=sum+i;
        //     }
        // }

        System.out.println("Sum of odd numbers from 1 to " + n + " is :- " + sum);
        sc.close();
    }
}