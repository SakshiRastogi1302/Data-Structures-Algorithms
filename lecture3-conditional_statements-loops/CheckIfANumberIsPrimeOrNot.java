import java.util.Scanner;

public class CheckIfANumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        boolean isPrime = true;

        // Normal Approach
        // for (int i = 2; i < n; i++) {
        //     if (n % i == 0) {
        //         isPrime = false;
        //         System.out.println(n + " is not a prime number");
        //         break;
        //     }
        // }

        //Efficient Approach
        for (int i = 2; i*i<=n; i++) {
            if (n % i == 0) {
                isPrime = false;
                System.out.println(n + " is not a prime number");
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        }
        sc.close();

    }
}
